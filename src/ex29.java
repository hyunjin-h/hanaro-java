// 접근제한자 4개!
// public protected default private
// * C언어는 접근제한자가 없어서, 모든 곳에서 접근가능.=> 변수의 변경을 감지하기 어렵다. 유지보수 힘들다 *

// public: 같은 폴더(패키지)에서, 다른 폴더의 클래스에서 접근가능
// protected: 같은 폴더+ 상속관계 클래스에서 접근 간으
// default: 같은 폴더
// private: 같은 클래스 안에서 접근 가능 (캡슐화, 은닉) **
//        : Getter/Setter함수 통해서 접근 가능하도록 허용하는 것!

class Hong {
	String name = "홍길동"; // default
	public int age = 30;
	protected int korScore = 80;
	private int engScore = 90;

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	void printEngScore() {
		System.out.println(this.engScore);
	}

}

public class ex29 {
	public static void main(String[] args) {
		Hong hong = new Hong();
		System.out.println(hong.getEngScore());
		hong.setEngScore(70);
	}
}
