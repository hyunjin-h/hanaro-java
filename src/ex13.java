import java.util.Scanner;

public class ex13 {
	public static void main(String[] args) {
		// Scanner 클래스 함수들
		// nextLine(): 문자열을 입력받되 엔터칠때까지(공백포함)
		// next(): 문자열의 공백까지만 입력받음
		// nextInt(), nextFloat(), nextDouble()
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		System.out.println(str1);

		String str2 = scan.next();
		System.out.println(str2);
		// ERROR: java.util.InputMismatchException
		// next()함수에 저장된 버퍼메모리가 정리되지 않아서이다.
		// 해결방안: nextLine()함수를 한번 실행해준다.
		int num1 = scan.nextInt();
		System.out.println(num1);

		scan.close(); // scan객체가 사용중인 메모리 정리
	}
}
