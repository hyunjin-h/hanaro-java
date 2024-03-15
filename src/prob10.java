import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class prob10 {
	public static void main(String[] args) {

		// 연습문제
		// 12월 25일에 크리스마스 이벤트를 시작한다.
		// 현재날짜 기준으로 D-Day를 출력하시오.
		// 출력예) "크리스마스까지 D-24일입니다"

		// 나의 답, 예시1
		LocalDate xmas = LocalDate.parse("2024-12-25");
		int dday = xmas.getDayOfYear() - LocalDate.now().getDayOfYear();
		System.out.printf("크리스마스까지 D-%d일입니다.\n", dday);

		// 예시2
		long days = ChronoUnit.DAYS.between(LocalDate.now(), xmas);
		System.out.println(days);


	}

}
