import java.util.Scanner;
public class Summer1106_7 {
	public static void main( String args[ ] ) {
		Scanner sc = new Scanner(System.in);

		System.out.print("ù ��° ���� �Է��Ͻÿ� : ");
		int a = sc.nextInt( );
		System.out.print("�� ��° ���� �Է��Ͻÿ� : ");
		int b = sc.nextInt( );

		if ( a > b )
			System.out.print("ù ��° ���� �� ��° ������ ũ��.");
		else if ( a == b )
			System.out.print("ù ��° ���� �� ��° ���� ����.");
		else 
			System.out.print("ù ��° ���� �� ��° ������ �۴�.");
	}
}