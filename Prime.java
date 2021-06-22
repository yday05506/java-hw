import java.util.Scanner;
public class Prime {
	public static void main( String args[ ] ) {
		Scanner sc = new Scanner(System.in);
		boolean b = false;
		System.out.print("수 입력 : ");
		int a = sc.nextInt( );
		System.out.print(a + "은(는) ");

		for (int i = 2; i <= a; i++) {
			if (a % i == 0)
				b = true;
		break;
		}
		if (b) 
			System.out.print("소수가 아닙니다.");
		else
			System.out.print("소수입니다.");
	}
}