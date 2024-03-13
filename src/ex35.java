import com.sun.security.jgss.GSSUtil;

// static 초기화 블럭
class StaticClass {
	int a;
	static int b = 0;// 프로그램 시작 시 초기화

	static { // => 클래스 호출시 한번만 호출됨!
		b = 5;
		System.out.println("Static block!");
	}

	// 생성자함수=> new를 할때 호출된다!!
	StaticClass() {
		a = 3;
		b = 10;
		System.out.println("constructor block!");
	}
}

public class ex35 {
	public static void main(String[] args) {
		System.out.println(StaticClass.b);
		StaticClass s = new StaticClass();
		System.out.println(StaticClass.b);
	}
}
