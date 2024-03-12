
public class ex31 {
	static void echo() {
		System.out.println("echo");
	}

	static void echo(int x) {
		System.out.println("echo" + x);
	}

	static void echo(String msg) {
		System.out.println("echo" + msg);
	}

	public static void main(String[] args) {
		// 메소드 오버로딩(과적)
		echo();
		echo(10);
		echo("야호~~~");
		// println이 전형적인 메소드 오버로딩이 되어있는 것이다!!!@!@!@!@!@!@!


		// 기술면접 질문
		// 1. 오버로딩 vs 오버라이드
		// 오버라이드 : 상속관계에서 자식클래스가 부모클래스
		//   메소드를 재정의하는 것.
		// 2. 추상화 클래스 vs 인터페이스
		// 3. 다형성
		// 4. 상속
		// 5. 생성자
	}
}
