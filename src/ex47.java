// 추상화(일반)클래스 : 다중상속은 안됨, 다단계 상속은 가능
class A {
}

class B extends A {
}

class C extends B { // 다단계상속 가능
}
// class D extends C,B,A{ //다중상속 불가
//}

interface IA {
}

interface IB {
}

class E implements IA, IB { // 다중상속 (한방에 기능확장!)
}

class SupermanClass extends C implements IA, IB {

}

public class ex47 {
	public static void main(String[] args) {

	}
}