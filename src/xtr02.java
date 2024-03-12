import java.util.ArrayList;
import java.util.Arrays;

public class xtr02 {
	public static void main(String[] args) {
		int[] name = new int[6];
		int i = 0;
		while (true) {
			int num = (int) (Math.random() * 45 + 1);
			if (Arrays.asList(name).contains(num)) {
				System.out.printf("%d 중복!! ", num);
			} else {
				name[i] = num;
				System.out.printf("%d ", num);
				i++;
			}
			if (i == 6) break;
		}
	}
}
// ArrayList<Integer> arr =new ArrayList<Integer>(6);