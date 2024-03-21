import java.util.Arrays;

public class test01 {
	public static void main(String[] args) {
		int[] arrayIndex1 = {2, 0, 1, 3, 4};
		int[] arrayIndex2 = {1, 2, 0, 4, 3};
		int[][] arrayNum = {
				{22, 92, 32, 42, 52},
				{23, 93, 33, 43, 53},
				{24, 94, 34, 44, 54},
				{35, 95, 35, 45, 55},
				{26, 96, 36, 46, 56}};
		int[] select = new int[5];
		for (int i = 0; i < 5; i++) {
			select[i] = arrayNum[arrayIndex1[i]][arrayIndex2[i]];
		}
		System.out.print("뽑힌 수들의 배열: ");
		
		System.out.print("[");
		for (int n : select) {
			System.out.print(n + ",");
		}
		System.out.print("]");
		System.out.println();
		
		System.out.print("최소값: ");
		System.out.println();
		System.out.print("최대값: ");
	}
}