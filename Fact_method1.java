import java.util.Scanner;
public class Fact_method1 {
	public static void main( String args[ ] ) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int sum = 1;

		System.out.print("¼ö ÀÔ·Â : ");
		int n = sc.nextInt( );
		System.out.print(n + "! = " );

		do {
			sum *= i;
			if (i == 1) System.out.print("1");
			else System.out.print("*" + i );
			i++;
		}
		while ( i <= n );
		System.out.print(" = " + sum);
	}
}