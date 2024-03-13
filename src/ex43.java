// 다형성 : 폴리모피즘
//      : 자식클래스 객체가 자기클래스또는 부모클래스의 타입을 모두 가질 수 있는 것.

// 왜 사용할까?
// =>   1. 타입의 유연성을 가지기 위해
//      2. 타입이 정확하지 않더라도 객체(참조변수)를 전달가능

class Parent {
	String name = "Parent";

	void parentMethod() {
		System.out.println("Parent 내 이름은 " + this.name);
	}
}

class Child extends Parent {
	String name = "Child";

	void childMethod() {
		System.out.println("Child 내 이름은 " + this.name);
	}
}

public class ex43 {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		System.out.println(p1.name);
		Child c1 = new Child();
		System.out.println(c1.name);

		// 1. 업캐스팅: 자식객체가 부모클래스 타입을 가지는 것.
		//      1) 대입연산자를 통해서 자동행변환 될 때
		Parent p2 = new Child(); // 객체는 Child로 만들어지는데, 타입(포인터)은 Parent
		System.out.println("p2의 이름은 " + p2.name);
		//      2) 형변환 연산자를 통해서 - 강제 형변환
		Parent p3 = (Parent) c1;
		System.out.println("p3의 이름은 " + p3.name);
		// 2. 다운캐스팅: 자식객체가 자녀클래스의 타입을 갖는 것. 강제캐스팅
		Child c2 = (Child) p2;
		System.out.println("c2의 이름은 " + c2.name);

		//                  v다운캐스팅 v 업캐스팅
		//                  +-------+--------+
		// Child클래스 객체 = | Child + Parent |
		//                  +-------+--------+


		// 4가지 형태
		Parent a = new Parent();
		Child b = new Child();
		Parent c = new Child();   // 업캐스팅
		Child e = (Child) c;      // 다운캐스팅
		// ERROR Child d = new Parent(); ==> 불가능-다형성과 무관함.

	}
}
