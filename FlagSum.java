import java.util.Scanner;
public class FlagSum {
	public static void main( String args[ ] ) {
		Scanner sc = new Scanner (System.in);
		int i;
		int sum = 1;
		int n = sc.nextInt( );
		for (i = 1; i <= n; i++) {
			if (i == 1) {
				sum += 1;
				System.out.print("1");
			} else {
				if (i % 2 == 0) {
					sum -= i;
					System.out.print("-" + i);
				} else {
					sum += i;
					System.out.print("+" + i);
				}
			}
		}
		System.out.print("= " + sum);
	}
}