public class xtr05 {
	public static void main(String[] args) throws InterruptedException {
		int out = 0;
		int player = 1;
		System.out.println("-------게임시작-------");
		System.out.println("<" + player + "번타자>");

		int strike = 0;
		int ball = 0;
		while (true) {

			int now = Math.random() > 0.5 ? 1 : 0;

			if (now == 1) {
				strike++;
				System.out.println("스트!");
			} else {
				ball++;
				System.out.println("볼~");
			}

			if (strike == 3) {
				out++;
				player++;
				System.out.println("*****삼진아웃*****");

				if (out == 3) {
					System.out.println("게임종료");
					break;
				}
				System.out.println("<" + player + "번타자>");
				strike = 0;
				ball = 0;
			}
			if (ball == 4) {
				player++;
				System.out.println("++++++1루진루+++++");
				System.out.println("<" + player + "번타자>");
				strike = 0;
				ball = 0;
			}
			Thread.sleep(1000);
		}


	}
}
