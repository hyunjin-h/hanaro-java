// 클래스의 상속: 부모(상위)클래스의 자산(필드,메소드)를 자녀(하위클래스)가 물려받는것.

// 사용 이유
// 1. 코드중복 피할수 있음
// 2. 계층 구조로 코드를 설계할 수 있다.

// 코드중복: 10개의 똑같은 코드가 있다면, 유지보수가 힘들다.
// 코드 중복을 줄이는 방법
// 0. 반복문이나 배열/리스트를 사용한다.
// 1. 함수로 재사용한다.
// 2. 클래스(필드+함수)로 재사용한다.
// 3. 클래스 상속을 이용한다. => 타입의 유연성--다형성
// 4. 추상화 클래스나 인터페이스를 사용한다.
class Animal {
	int age = 10;

	void eat() {
		System.out.println("먹는다!");
	}
}

class Dog extends Animal {
	public Dog() {
		System.out.println("{(-*-)}");
	}

	void bark() {
		System.out.println("짖는다.");
	}

}

class Cat extends Animal {
	public Cat() {
		System.out.println(" ^  ^");
		System.out.println("( -*-)");
	}

	void grooming() {
		System.out.println("손질한다.");
	}
}

public class ex36 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		System.out.println(dog.age);
		Cat cat = new Cat();
		cat.grooming();
		cat.eat();

	}
}
