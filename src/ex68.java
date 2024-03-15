import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ex68 {
	public static void main(String[] args) {
		// 맵
		
		// 키문자열   값타입
		Map<String, String> map = new HashMap<>();
		map.put("username", "hong");
		map.put("password", "1234");
		System.out.println(map);
		System.out.println(map.get("username"));
		System.out.println(map.get("password"));
		
		// for each
		for (String key : map.keySet()) { // key가 set값으로 되어있음
			System.out.println(map.get(key));
		}
		// 이터레이터
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			System.out.println(map.get(it.next()));
		}
	}
}
