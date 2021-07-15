public class For_Test5_1106 {
	public static void main( String args[ ] ) {
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			if ( i == 1) System.out.print("1 ");
			else if (i != 10) System.out.print("+ ( " + i + " * " + i + " ) " );
			else System.out.print( "+ ( " + i + " * " + i + " )" );
			sum += (i*i);
		}
		System.out.print(" = " + sum);
	}
}