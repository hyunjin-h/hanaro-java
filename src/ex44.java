// TODO

class People {
	void think() {
		System.out.println("생각한다.");
	}
}

class Man extends People {

	@Override
	void think() {
		System.out.println("남자가 생각한다.");
	}

	void shave() {
		System.out.println("면도한다.");
	}
}

class Woman extends People {

	@Override
	void think() {
		System.out.println("여자가 생각한다.");
	}

	void makeup() {
		System.out.println("화장한다.");
	}
}

public class ex44 {
	public static void main(String[] args) {
		// 1. 업캐스팅
		People people = new Man();
		//

	}
}
