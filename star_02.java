public class star_02 {
	public static void main( String args[ ] ) {
		for (int i = 1; i <=5; i++) {
			for(int j = 1; j <= 6-i; j++) {
				if (j > 4) 
				System.out.print("\n");
				System.out.print("*" + "\t");
			}
			System.out.println( );
		}
	}
}