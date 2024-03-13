// final이 클래스 안에서 사용될 때
final class FinalClass {
	String name = "Final Class";
	final int price = 1000; // 상수타입의 필드, 힙영역의 참조변수는 강제초기화

	final void disp() {
	}
}
/*
 ERROR class LastClass extends FinalClass{ => final클래스 상속 불가

 	ERROR => final 메소드 오버라이드(재정의) 불가
 	@Override
 	void disp(){}
 }
*/

public class ex41 {
	public static void main(String[] args) {
		FinalClass fc = new FinalClass();
		// ERROR fc.price=2000; => final 필드 수정불가

		// 상수 선언 시
		final double PI = 3.141592;
		// ERROR PI=6.13; => final 필드 수정불가


	}
}
