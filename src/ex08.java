public class ex08 {
	public static void main(String[] args) {
		// 단항: ++ -- !(논리반전) (타입)

		// 비트단위연산
		int k = 10; // 32bit 000000...1010
		int m = ~k; //       111111...0101
		System.out.println(Integer.toBinaryString(k));
		System.out.println(Integer.toBinaryString(m));
		System.out.printf("%032d\n", Integer.parseInt(Integer.toBinaryString(k)));

		String binaryString = String.format("%32s", Integer.toBinaryString(k)).replace(" ", "0");
		System.out.println(binaryString);
	}
}
