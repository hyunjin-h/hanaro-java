import java.util.Scanner;

public class xtr03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		for (int i = 1; i <= num; i++) {
			if (i == 3 || i == 6 || i == 9) {
				System.out.print("X ");
			} else {
				System.out.printf("%d ", i);
			}
		}
	}
}
