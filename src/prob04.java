public class prob04 {
	public static void main(String[] args) {
		// 나머지 연산자 %
		int k = 123;
		// 연습문제 - 나머지연산자를 이용하여
		// 1. 일의 자릿수 3을 출력하시오.
		System.out.println(k % 10);
		// 2. 십의 자릿수 2를 출력하시오.
		System.out.println(k % 100 / 10);
		System.out.println(k / 10 % 10);
		// 3. 백의 자릿수 1을 출력하시오.
		System.out.println(k / 100);

		double d = 3.567;
		// 4. 소숫점 첫째자리를 출력하시오.
		//      1) Math.floor
		//      2) (int) 형변환연산자
		System.out.println((int) (d * 10 % 10));
		// 5. 소숫점 첫째자리에서 반올림하여 출력하시오. 4.0
		//      1) Math.round => 소숫점 첫째자리에서 반올림하는 함수
		//      2) 0.5를 더해준다. -> (int) 형변환으로 소수점 날리기
		//         ex) 3.49 (+ 0.5) ->int-> 3
		//             3.5  (+ 0.5) ->int-> 4
		System.out.printf("%.1f\n", (float) Math.round(d));
		// 6. 소숫점 둘째자리에서 반올림하여 출력하시오. 3.6
		//      1) Math.round( d * 10 ) / 10.0
		System.out.printf("%.1f", d);

		// System.out.println((int) (d % 10) + ((d * 10 % 10) >= 5 ? 1 : 0));
		// System.out.println(((int) ((d * 10) + ((d * 10 % 10) >= 5 ? 1 : 0))) / 10.0);

	}
}
