public class For1to10sum {
	public static void main( String args[ ] ) {
		int b = 0;
		for(int a = 1; a <= 10; a++)
			b += a;
		System.out.println("1부터 10까지의 합은 " + b + "입니다.");
	}
}