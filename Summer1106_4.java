import java.util.Scanner;
public class Summer1106_4 {
	public static void main ( String args[ ] ) {
		Scanner sc = new Scanner(System.in);

		System.out.print("입력하십시오 : ");
		int n = sc.nextInt( );

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++)
				if (i==j)
					System.out.print( (char)('A'+i-1) );
				else
				System.out.print("*");
		System.out.println( );
		}
	}
}