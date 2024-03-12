import com.sun.source.tree.ReturnTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class xtr04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = 1;
		System.out.println("컴퓨터: " + i);

		while (i <= 40) {
			System.out.print("나: ");
			String me = in.nextLine();
			String answer = clap(i + 1);

			if (!me.equals(answer)) {
				System.out.println("컴퓨터승");
				return;
			} else {
				if (me.equals("40")) {
					System.out.println("무승부");
					return;
				}
				i += 2;
				System.out.print("컴퓨터: ");
				System.out.println(clap(i));
			}
		}
	}

	public static String clap(int num) {
		ArrayList<Integer> c = new ArrayList<>(Arrays.asList(3, 6, 9));
		int n = 0;
		if (c.contains(num % 10)) {
			n++;
		}
		if (c.contains(num / 10)) {
			n++;
		}
		if (n == 2) {
			return "XX";
		} else if (n == 1) {
			return "X";
		}
		return Integer.toString(num);
	}
}
