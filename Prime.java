import java.util.Scanner;
public class Prime {
	public static void main( String args[ ] ) {
		Scanner sc = new Scanner(System.in);
		boolean b = false;
		System.out.print("�� �Է� : ");
		int a = sc.nextInt( );
		System.out.print(a + "��(��) ");

		for (int i = 2; i <= a; i++) {
			if (a % i == 0)
				b = true;
		break;
		}
		if (b) 
			System.out.print("�Ҽ��� �ƴմϴ�.");
		else
			System.out.print("�Ҽ��Դϴ�.");
	}
}