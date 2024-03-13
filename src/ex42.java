// 클래스 객체 배열 사용하기

class Snack {
	String name = "새우깡";
	int price = 1000;

	// 필드가 있는 생성자
	public Snack(String name, int price) {
		this.name = name;
		this.price = price;
	}
}

public class ex42 {
	public static void main(String[] args) {
		// 정수형 1차배열
		int[] nums = new int[5];
		// 클래스객체 1차배열
		Snack[] snacks = new Snack[5];
		snacks[0] = new Snack("짱구", 2000);
		snacks[1] = new Snack("포카칩", 3000);
		snacks[2] = new Snack("허니버터칩", 4000);
		snacks[3] = new Snack("바나나킥", 8000);
		snacks[4] = new Snack("왕고래밥", 10000);
		for (Snack snack : snacks) {
			System.out.println(snack.name);
			System.out.println(snack.price);
		}

	}
}
