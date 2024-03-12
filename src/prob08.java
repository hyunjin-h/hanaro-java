public class prob08 {
	public static void main(String[] args) {
		// 연습문제
		// 1. 2차원 정수배열 nums를 행 3개, 열 3개로 만들고,
		// 모든 행열에 값을 넣되,
		// 랜덤값 정수 1~100 사이의 값을 넣고,
		// 전체를 순환하여 출력하시오.
		int[][] arrNum1 = new int[3][3];
		for (int i = 0; i < arrNum1.length; i++) {
			for (int j = 0; j < arrNum1[i].length; j++) {
				arrNum1[i][j] = (int) (Math.random() * 100 + 1);
			}
		}
		for (int i = 0; i < arrNum1.length; i++) {
			for (int j = 0; j < arrNum1[i].length; j++) {
				System.out.print(arrNum1[i][j] + " ");
			}
			System.out.println();
		}
		// 2. 최소값과 최대값을 출력하시오.
		int max = arrNum1[0][0];
		int min = arrNum1[0][0];

		for (int i = 0; i < arrNum1.length; i++) {
			for (int j = 0; j < arrNum1[i].length; j++) {
				if (arrNum1[i][j] > max) {
					max = arrNum1[i][j];
				}
				if (arrNum1[i][j] < min) {
					min = arrNum1[i][j];
				}
			}
		}
		System.out.println("min : " + min + " max : " + max);
		// 3.
		// 순돌이네 인쇄소
		// 3x3 2차원 정수배열에 아래와 같은 숫자가 들어있다면,
		// 0 1 0       #  *  #
		// 1 2 0   =>  *  +  #
		// 1 0 0       *  #  #
		// 이렇게 출력이 된다.
		// 0 1 2
		// 1 2 0
		// 2 1 0 이렇게 들어가 있을때 출력결과를 표시하시오.
		int[][] data = {{0, 1, 2},
				{1, 2, 0},
				{2, 1, 0}};

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				if (data[i][j] == 0) System.out.print("# ");
				if (data[i][j] == 1) System.out.print("* ");
				if (data[i][j] == 2) System.out.print("+ ");
			}
			System.out.println();
		}
	}
}
