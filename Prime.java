import java.util.Scanner;
public class Prime {
	public static void main( String args[ ] ) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.print("�� �Է� : ");
		int a = sc.nextInt( );
		System.out.print(a + "��(��) ");

		for (int i = 1; i <= a; i++) {
			if (a % i == 0)
				num++;
		}
		if (num == 2) 
			System.out.print("�Ҽ��Դϴ�.");
		else
			System.out.print("�Ҽ��� �ƴմϴ�.");
	}
}