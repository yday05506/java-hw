import java.util.Scanner;
public class Prime {
	public static void main( String args[ ] ) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.print("수 입력 : ");
		int a = sc.nextInt( );
		System.out.print(a + "은(는) ");

		for (int i = 1; i <= a; i++) {
			if (a % i == 0)
				num++;
		}
		if (num == 2) 
			System.out.print("소수입니다.");
		else
			System.out.print("소수가 아닙니다.");
	}
}