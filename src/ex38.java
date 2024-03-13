// 생성자 함수-메소드 오버로딩이 가능하다.
//          : 매개변수 타입과 개수를 다르게함으로 함수를 확장하는 것
class Robot {
	String color = "빨강";
	int price = 1000;

	// 기본(필드가 없는) 생성자 함수
	public Robot() {
		System.out.println("기본 생성자함수");
	}

	// 필드가 있는 생성자 함수
	public Robot(String color) {
		this.color = color;
		System.out.println("필드 생성자함수");
	}

	public Robot(String color, int price) {
		this.color = color;
		this.price = price;
		System.out.println("필드가 있는 생성자함수");
	}
}

public class ex38 {
	public static void main(String[] args) {
		Robot r1 = new Robot();
		Robot r2 = new Robot("노랑");
		Robot r3 = new Robot("파랑", 3000);

		System.out.println(r1.color);
		System.out.println(r2.color);
		System.out.println(r3.color + r3.price);


	}
}
