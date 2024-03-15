// 람다식
// 코드를 변수처럼 전달하기 위해서

// 3세대 언어 특징->함수형

@FunctionalInterface // 람다식 선언 시에 사용
interface MyFunc1 {
	int calc(int x, int y);
}

public class ex64 {
	public static void main(String[] args) {
		MyFunc1 f1 = (x, y) -> {
			return x + y;
		};
		System.out.println(f1.calc(10, 20));

		exeFunc(f1);// 코드를 함수에 전달!

	}

	static void exeFunc(MyFunc1 f1) {
		System.out.println(f1.calc(10, 20));
	}

}
