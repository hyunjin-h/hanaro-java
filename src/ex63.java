
// 제네릭 Generic : 형(타입)에 따른 선언을 편하게 하기 위해 사용함=>JDK 1.5부터 지원
class Keyboard1 {
	private Object object; // 다형성을 이용한 모든 클래스 객체를 넣을 수 있다.

	public Object getObject() { // 8개rlqhqs
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
}

class Keyboard2<MyType> { // Mytype은 가변타입입니다.
	private MyType object;

	public MyType getObject() {
		return object;
	}

	public void setObject(MyType object) {
		this.object = object;
	}
}

public class ex63 {
	public static void main(String[] args) {
		Keyboard1 k1 = new Keyboard1();
		k1.setObject("키보드1");
		String str = (String) k1.getObject();

		Keyboard2<String> k2 = new Keyboard2<>();// 뒷쪽의 제네릭 타입은 생략가능
		k2.setObject("키보드2");
		String str2 = k2.getObject();

		Keyboard2<Integer> k3 = new Keyboard2<>();
		k3.setObject(10);
		Integer i = k3.getObject();
	}
}
