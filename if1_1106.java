import java.util.Scanner;
public class if1_1106 {
	public static void main( String args[ ] ) {
		Scanner sc = new Scanner(System.in);
			
		System.out.print("����(1), ����(2), ��(3) �Է� : ");
		int a = sc.nextInt( );

		switch(a) {
			case 1 : System.out.print("����� ������ "); break;
			case 2 : System.out.print("����� ������ "); break;
			case 3 : System.out.print("����� ���� "); break;
			default : System.out.print("�߸� ");
		}

		/* if (a == 1)
			System.out.print("����� ������ ");
		else if (a == 2)
			System.out.print("����� ������ ");
		else if (a == 3)
			System.out.print("����� ���� ");
		else
			System.out.print("�߸� ");
		*/

		System.out.print("���̽��ϴ�.");
	}
}