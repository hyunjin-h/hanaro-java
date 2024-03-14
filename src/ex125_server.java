// 기능 및 설계 요구사항
// 1. 2인용 통신을 이용한 온라인 게임
// 2. 서버프로그램 1개 + 클라이언트 프로그램 2개
//   클라1 <---> 서버 <--> 클라2
// 3. 서버는 3x3 정수형 2차 배열에 바둑판의 정보를 static으로 가진다.
// 4. 0은 빈 칸, 1은 O, 2는 X 이다.
// 5. 출력예)
// 클라1 "c1,0,0,O" 전송 후 서버는 "1,0,0,0,0,0,0,0,0"를 받는다.
// 서버 "c1,0,0,O" 수신 후 서버는 "1,0,0,0,0,0,0,0,0"을 보낸다.
// 클라2 "c2,0,1,X" 전송 후 서버는 "1,2,0,0,0,0,0,0,0"를 받는다.
// 서버 "c2,0,0,X" 수신 후 서버는 "1,2,0,0,0,0,0,0,0"을 보낸다.
// 6. 클라1이나 클라2가 서버의 정보를 요청한다.
//  "info"라고 보내면, 서버는 현재의 정보를 보낸다.
//  "info" => "1,2,0,0,0,0,0,0,0"
// 6. 게임판 출력 양식은
//- X -
//- X O
//- - -
// 7. 게임판정
// 가로,세로,대각선 방향으로 O/X가 3개 연속되면, 승리하게 된다.

import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.Objects;

// 개발순서
// 서버 : int[][] map = new int[3][3];
// 클라1 : "c1,0,0,O" 문자열을 서버로 전송
// 서버 : "c1,0,0,O"을 꼼마 단위로 문자열배열로 만들고,
//       map 정수배열 값을 업데이트한다.
// 서버 : "1,0,0,0,0,0,0,0,0" 문자열을 클라1에게 전송한다.
// 클라1 : "1,0,0,0,0,0,0,0,0" 문자열을 꼼마단위로 분석해서,
//       map 정수배열 값을 업데이트한다.
// 서버 : 게임판정을 해서 승리한 클라이언트 이름을 출력한다.
public class ex125_server {
	public static int checkBingo(int[][] board) {
		int rows = board.length;
		int cols = board[0].length;

		// 행 검사
		for (int i = 0; i < rows; i++) {
			boolean same = true;
			for (int j = 1; j < cols; j++) {
				if (board[i][j] != board[i][0]) {
					same = false;
					break;
				}
			}
			if (same) {
				return board[i][0];
			}
		}

		// 열 검사
		for (int j = 0; j < cols; j++) {
			boolean same = true;
			for (int i = 1; i < rows; i++) {
				if (board[i][j] != board[0][j]) {
					same = false;
					break;
				}
			}
			if (same) {
				return board[0][j];
			}
		}

		// 대각선 검사
		boolean diagonal1 = true;
		boolean diagonal2 = true;
		for (int i = 1; i < rows; i++) {
			if (board[i][i] != board[0][0]) {
				diagonal1 = false;
			}
			if (board[i][cols - 1 - i] != board[0][cols - 1]) {
				diagonal2 = false;
			}
		}
		if (diagonal1 || diagonal2) {
			return board[0][0];
		}

		return -1; // 빙고가 없는 경우 널
	}


	public static void main(String[] args) {
		int[][] map = new int[3][3];
		ServerSocket serverSocket = null;
		try {

			serverSocket = new ServerSocket();
			serverSocket.bind(
					new InetSocketAddress("172.16.20.219", 5001));
			while (true) {

				for (int[] cc : map) {
					for (int c : cc) {
						System.out.print(c);
					}
					System.out.println();
				}
				System.out.println("서버가 연결을 기다리는 중...");
				Socket socket = serverSocket.accept(); // Blocking..대기중..
				InetSocketAddress isa =
						(InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("서버가 연결을 수락함:" + isa.getHostName());

				// 클라이언트 데이타를 수신한다.
				byte[] bytes = null;
				String message = null;
				InputStream is = socket.getInputStream();
				bytes = new byte[1024]; // 1024바이트만큼 버퍼메모리 생성
				int readByteCount = is.read(bytes);
				message = new String(bytes, 0, readByteCount, "UTF-8");
				System.out.println("서버가 데이타받기 성공함.");
				System.out.println("서버가 받은 데이타:" + message);
				String[] array = message.split(",");

				map[Integer.parseInt(array[1])][Integer.parseInt(array[2])] = (Objects.equals(array[3], "O")) ? 1 : 2;

				String str = "\n";

				int rowCount = map.length;
				int colCount = map[0].length;
				for (int i = 0; i < rowCount; i++) {
					for (int j = 0; j < colCount; j++) {
						str += String.valueOf(map[i][j]);
						if (i != rowCount - 1 || j != colCount - 1) {
							str += ",";
						}
					}
				}
				// String joinString = String.join(", ", str);

				// 서버에서 클라로 데이타 보내기
				OutputStream os = socket.getOutputStream();
				// message = "Hi~ This is Server~";
				bytes = str.getBytes("UTF-8");
				os.write(bytes);
				os.flush(); // 버퍼에 있는 데이타 밀어내기
				System.out.println("서버가 클라에게 데이타보내기 성공");
				int winner = checkBingo(map);
				if (winner != -1) {
					if (winner == 1) {
						System.out.println("c1 승리!");
						map = new int[3][3];
					}
					if (winner == 2) {
						System.out.println("c2 승리!");
						map = new int[3][3];
					}


				}

				is.close();
				os.close();
				socket.close();
				if (message.equals("exit")) { //"exit"문자열이면 서버 종료!
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("서버 초기화 에러!");
		}
	}
}
