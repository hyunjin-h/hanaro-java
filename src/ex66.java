// 콜렉션프레임워크
// 1. 리스트: List인터페이스구현-ArrayList,LinkedList
// 2. 맵-HashMap
// 3. 셋-HashSet

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ex66 {

	public static void main(String[] args) {
		// ArrayList<String> fruits=new ArrayList<>();
		List<String> fruits = new ArrayList<>(); // => 이걸 더 많이 씀
		fruits.add("사과");
		fruits.add("망고");
		fruits.add("딸기");

		System.out.println(fruits.size());
		System.out.println(fruits);
		fruits.add(0, "레몬");
		fruits.remove(1);
		System.out.println(fruits);

		// 정렬
		Collections.sort(fruits);
		System.out.println(fruits);
		Collections.sort(fruits, Collections.reverseOrder());
		System.out.println(fruits);

		// 치환
		fruits.set(1, "복숭복숭");
		System.out.println(fruits);
		// fruits.clear();
		System.out.println(fruits);

		// 열거자 Iterator
		Iterator<String> it = fruits.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(fruits.contains("망고"));


	}
}
