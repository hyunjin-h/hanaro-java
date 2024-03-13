// 오버라이드(Override) : 부모의 메소드를 자식에서 재정의, 부모 메소드 무시
// NOTE 오버로딩과 다름!!! (매개변수 타입과 개수를 다르게함으로 함수 *확장*)
class Machine {
	String name = "일반기계";

	void work() {
		System.out.println("일한다.");
	}
}

class CoffeeMachine extends Machine {
	String name = "커피머신";

	// 오버라이드 메소드: 반환타입 함수이름 매개변수 동일
	// 어노테이션: @로 시작하는 컴파일 지시어.
	// 역할: 개발자나 컴파일러에게 해당 속성을 알려줌.
	@Override
	// 생략 가능~
	void work() {
		System.out.println("커피머신이 일한다.");
	}
}

public class ex40 {
	public static void main(String[] args) {
		CoffeeMachine cm = new CoffeeMachine();
		cm.work();
	}
}
