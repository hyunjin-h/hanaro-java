// 연습문제 - 클래스 설계
// 카페를 클래스로 설계해보자
// 클래스이름 : Cafe
// 속성 : coffeeCount   커피갯수는 10개로 초기화
// 행동 : sale          출력값은 "커피를 판다"
// 클래스를 설계하고, 객체를 생성해서 속성값을 출력하고,
//  행동을 실행시켜보자.
// sale함수를 호출하면 coffeeCount가 하나 준다.
// sale함수를 3번 호출후, coffeeCount를 출력하시오.

// 2.
// 당근농장을 클래스로 설계해 보자
// 클래스이름 : Farm
// 속성 : carrot 당근의 갯수 초기값은 0
// 행동 : plant() 호출시마다 당근을 하나씩 생산하고,
//       속성 carrot++를 해준다.
//       호출시 "당근을 1개 생산했습니다." 출력한다.
// 당근을 plant()함수를 이용하여 5개 생산한 후 당근 갯수를
// 출력하시오.

class Cafe {
	int coffeeCount = 10;

	void sale() {
		this.coffeeCount -= 1; // this는 자기 클래스를 의미한다.함수 안에 없으면 생략해도 되지만!
		System.out.println("커피를 판다.");
	}
}

class Farm {
	int carrot = 0;

	void plant() {
		carrot++;
		System.out.println("당근을 1개 생산했습니다.");
	}
}

public class ex26 {
	public static void main(String[] args) {
		Cafe myCafe = new Cafe();
		Farm myFarm = new Farm();
		for (int i = 0; i < 3; i++) {

			myCafe.sale();
		}
		System.out.println("커피: " + myCafe.coffeeCount);
		for (int i = 0; i < 5; i++) {

			myFarm.plant();
		}
		System.out.println("당근: " + myFarm.carrot);


	}
}
