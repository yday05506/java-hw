import java.util.Scanner;
public class Fact_method {
	public static void main( String args[ ] ) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int sum = 1;
		System.out.print("�� �Է� : ");
		int n = sc.nextInt( );
		System.out.print("n! = ");

		for (i = 1; i <= n; i++) {
			sum *= i;
			if (i==1) System.out.print("1");
			else System.out.print("*" + i);
		}
		System.out.print(" = " + sum );
	}
}