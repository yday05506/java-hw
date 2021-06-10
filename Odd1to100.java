public class Odd1to100 {
	public static void main( String args[ ] ) {
		int a = 0;
		int i;
		for (i = 1; i <= 100; i++) 
			if ( i % 2 == 1) a += i;
		System.out.println(a);
	}
}