public class ex05 {
	//
	public static void main(String[] args) {
		String str1 = new String("안녕");     // 새로운 객체생성
		String str2 = "안녕";                        // 같은 내용의 리터럴 객체 있는지 확인
		String str3 = "안녕";                        // 같은 내용의 리터럴 객체 있는지 확인
		//                                              있으면 새로 생성 안하고 주소값만 복사
		String str4 = new String("안녕");     // 새로운 객체 생성

		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str3 == str4);
		System.out.println(str4 == str1);

		// 문자열 연결 연산자 +
		// 산술 연산자 +

		// 기본자료형-> 문자열형으로 변환
		String str = String.valueOf(10);
		// 문자열형 -> 정수형
		int num = Integer.parseInt("10");

	}
}
