import java.util.Scanner;
public class Summer1106_6 {
	public static void main( String args[ ] ) {
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int sum = 1;

		System.out.print("성적을 입력하시오. ");
		for (int i = 1; i <= 5; i++) {
			a = sc.nextInt( );
			sum += a;
		}

		System.out.print("평균 : ");
		System.out.println(sum /= 5);
	}
}