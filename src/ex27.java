// static 변수/함수에 대해서
// static 예약어: 정적 변수(객체)/함수를 지정할 때 사용
// 의미: 프로그램 구동 시에 고정된 메모리 번지에 들어감. 종료시까지 변경 x
// 사용 이유: 1. 시작점(Entry Point)를 지정할 때 사용함
//          2. 중요한 데이터를 안정적으로 저장할 때
//          3. 자주 사용하는 유틸성 클래스에 지정한다. > new 사용 없이 클래스 함수 사용 가능!


class BallFactory {
	int ballCount = 100;

	void make() {
		this.ballCount++;
		System.out.println("축구공 생산!");
	}

}

class FoodFactory {
	static int foodCount = 200;

	static void make() {
		foodCount++; // this 안됨!
		System.out.println("도시락생산");
	}
}

public class ex27 {
	public static BallFactory myBallFactory; // 이런식으로도 가능

	public static void main(String[] args) {
		BallFactory ballFactory = new BallFactory();
		System.out.println(ballFactory.ballCount);
		// static은 클래스이름뒤에 점을 찍어서 바로 접근
		System.out.println(FoodFactory.foodCount);
		// Math.random(혹은 다른것)도 static!=>유틸성 바로 쓰기 위해
		System.out.println(Math.random());
	}
}
