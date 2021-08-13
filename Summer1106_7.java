import java.util.Scanner;
public class Summer1106_7 {
	public static void main( String args[ ] ) {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 수를 입력하시오 : ");
		int a = sc.nextInt( );
		System.out.print("두 번째 수를 입력하시오 : ");
		int b = sc.nextInt( );

		if ( a > b )
			System.out.print("첫 번째 수가 두 번째 수보다 크다.");
		else if ( a == b )
			System.out.print("첫 번째 수와 두 번째 수는 같다.");
		else 
			System.out.print("첫 번째 수가 두 번째 수보다 작다.");
	}
}