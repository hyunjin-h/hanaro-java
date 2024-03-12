public class prob09 {
	public static void calc(int x) {
		System.out.println("1. " + x);
	}

	public static void calc(int x, int y) {
		System.out.println("2. " + (x + y));
	}

	public static void calc(int x, int y, int z) {
		System.out.println("3. " + Math.max(Math.max(x, y), z));
	}

	public static void main(String[] args) {
		// 연습문제 - 오버로딩 연습
		// 메소드(함수) 이름 : calc
		// 반환형은 없음.
		// 1. 매개변수 정수형 1개일때는 그냥 변수값만 출력
		// 2. 매개변수 정수형 2개일때는 두 변수의 합계를 출력
		// 3. 매개변수 정수형 3개일때는 세 변수중에서
		//   최대값을 출력하시오.
		calc(1);
		calc(1, 2);
		calc(1, 2, 3);


	}
}
