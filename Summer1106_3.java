import java.util.Scanner;
public class Summer1106_3 {
	public static void main ( String args[ ] ) {
		Scanner sc = new Scanner(System.in);
		System.out.print("성적을 입력하시오 : ");
		int a = sc.nextInt( );

		Summer1106_3 summer = new Summer1106_3( );
		int b = summer.score(a);
	}

	public int score (int a) {
		if ( a >= 90 && a <= 100)
			System.out.println("A");
		else if ( a <= 80 )
			System.out.println("B");
		else if ( a <= 70 )
			System.out.println("C");
		else if ( a <= 60 )
			System.out.println("D");
		else
			System.out.println("F");
		return a;
	}
}