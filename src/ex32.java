// 싱글톤(Singleton) : 프로그램안에서의 유일한 객체
// 유일한 객체가 필요한이유?
// 유일한 정보를 저장하기 위해서

class FishBun { // 일반 붕빵 : 일반 객체
	int bunNo = 10;
}

class UniqueFishBun { // 절대 붕빵 : 싱글톤
	int bunNo = 30;
	private static UniqueFishBun singleton = new UniqueFishBun();

	static UniqueFishBun getInstance() {
		return singleton;
	}
}

public class ex32 {
	public static void main(String[] args) {
		// 싱글톤 객체
		UniqueFishBun uBun1 = UniqueFishBun.getInstance();
		UniqueFishBun uBun2 = UniqueFishBun.getInstance();
		System.out.println(uBun1);
		System.out.println(uBun2); // 주소 같음!

		// 일반 객체
		FishBun bun1 = new FishBun();
		FishBun bun2 = new FishBun();
		FishBun bun3 = new FishBun();
		System.out.println(bun1);
		bun1.bunNo = 20;
		System.out.println(bun2);// 주소 다름!
		System.out.println(bun1.bunNo);
		System.out.println(bun2.bunNo);
		// 일반 객체는 일관된 데이터를 저장할 수 없다.
		// dynamic하다. 객체의 생성과 소멸이 자유롭게 이루어짐
		// GC(Garbage Collector)가 메모리를 자동으로 회수한다.


	}
}
