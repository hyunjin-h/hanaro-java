import java.util.Objects;
import java.util.Scanner;

public class mini01 {
	static int[][] map = {
			// 0:빈칸 1:벽 2:사람 3:골인
			// map[1][1] = 2  => "d"키입력 =>  map[1][1] = 0, map[1][2] = 2
			//                                   x  y           x  y+1
			// map[1][1] = 2  => "s"키입력 =>  map[1][1] = 0, map[2][1] = 2
			//                                   x  y           x+1 y
			// col 0 1 2
			{1, 1, 1, 1, 1, 1, 1}, // row 0
			{1, 2, 1, 0, 0, 3, 1}, // 1
			{1, 0, 1, 0, 1, 1, 1}, // 2
			{1, 0, 1, 0, 0, 0, 1},
			{1, 0, 1, 1, 1, 0, 1},
			{1, 0, 0, 0, 0, 0, 1},
			{1, 1, 1, 1, 1, 1, 1},

	};

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int xpos = 1;
		int ypos = 1;
		print();
		while (true) {
			int nx = xpos;
			int ny = ypos;
			String key = in.nextLine();
			if (Objects.equals(key, "a")) {
				nx -= 1;
			} else if (Objects.equals(key, "d")) {
				nx += 1;
			} else if (Objects.equals(key, "w")) {
				ny -= 1;
			} else if (Objects.equals(key, "s")) {
				ny += 1;
			}
			if (map[ny][nx] == 1) {
				System.out.println("벽입니다.");
			} else {
				if (map[ny][nx] == 3) {
					System.out.println("GOALLLL!!");
					map[ypos][xpos] = 0;
					xpos = nx;
					ypos = ny;
					map[ypos][xpos] = 2;
					print();
					break;
				}
				map[ypos][xpos] = 0;
				xpos = nx;
				ypos = ny;
				map[ypos][xpos] = 2;
			}

			print();
		}

	}

	public static void print() {
		for (int i = 0; i < map.length; i++) {
			int[] inArr = map[i];
			for (int j = 0; j < inArr.length; j++) {
				// System.out.print(inArr[j] + " ");
				if (inArr[j] == 0) System.out.print("  ");
				if (inArr[j] == 1) System.out.print("■ ");
				if (inArr[j] == 2) System.out.print("● ");
				if (inArr[j] == 3) System.out.print("* ");
			}
			System.out.println();
		}

	}
}
