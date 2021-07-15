import java.util.Scanner;
public class For_Test4_1106 {
	public static void main( String args[ ] ) {
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		System.out.print("╪Ж ют╥б : ");
		int n = sc.nextInt( );
		for (double i=1; i <= n; i++) {
			if (i == 1) System.out.print("1 + ");
			else if (i != n) System.out.print("(1/" + (int)i + ") + " );
			else System.out.print("(1/" + (int)n + ") " );	
			sum += (1/i);
		}
		System.out.print("= "+ sum);
	}
}