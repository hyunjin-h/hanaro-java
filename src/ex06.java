import java.util.Arrays;

public class ex06 {
	// 문자열 관련 함수들
	public static void main(String[] args) {
		String str1 = "Hello, java";
		String str2 = "안녕하세요 반갑습니다.";
		// 문자열 길이
		System.out.println(str1.length());
		// 문자 한자만 가져오기
		char c1 = str1.charAt(0);
		System.out.println(c1);

		// 문자열 위치(인덱스) 가져오기
		System.out.println(str1.indexOf("java"));
		// 마지막 문자(열)위치 가져오기
		System.out.println(str1.lastIndexOf("a"));
		// toUpperCase, toLowerCase
		// toLowerCase().indexOf(); 문자열로 검색시 다 소문자로 바꿔서 검색

		// replace(기존,바꿀) : 문자열 치환
		// substring(시작, 끝-1): 문자열 배열로 가져오기
		System.out.println(str1.substring(0, 4));

		String[] strArray = "abc/def-ghi jkl".split("/|-| ");
		System.out.println(strArray.length);

		// Array.toString() : 배열을 문자열로 변환
		System.out.println(Arrays.toString(strArray));


		// trim() : 공백 사라짐
		// concat() :  문자열 연결함수
		// contains() : 문자열 포함하는지 확인
		// equals() :  문자열 내용만 비교

		// =====> prob03

	}
}
