
// 객체 지향 프로그래밍 OOP
// 모든 사물을 객체(물건)로 추상화(모델링, 설계)하여 프로그래밍
// 속성(변수, 필드)과 행동(메소드,함수)로 구분

// 클래스 선언부
class Car {
	// 속성=변수(필드)=멤버변수
	int price = 1000;

	// 행동(동작)=함수(메소드)=멤버함수
	void run() {
		System.out.println("run~~");
	}
}

public class ex25 {
	public static void main(String[] args) {
		// 클래스의 객체 생성 및 호출부
		// 클래스 이름,객체이름=new 클래스이름()
		Car objCar = new Car();
		// 객체이름뒤에 점을 직으면 멤버변수/함수에 접근가능.
		System.out.println(objCar.price);
		objCar.run();
		// System.out.println(objCar.run()); => void! 반환값 없어서 오류남

	}
}
