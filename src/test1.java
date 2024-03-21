class H {
	int a;
	static int b;
	
	static {
		b = 10;
	}
	
	public H(int a) {
		b += a;
		b++;
		
	}
}

class test1 {
	public static void main(String[] args) {
		H h1 = new H(1);
		System.out.println(h1.b);
		H h2 = new H(2);
		System.out.println(h2.b);
		H h3 = new H(3);
		System.out.println(h3.b);
		System.out.println(H.b);
	}
}
