import java.util.Scanner;
public class Summer1106_6 {
	public static void main( String args[ ] ) {
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int sum = 1;

		System.out.print("������ �Է��Ͻÿ�. ");
		for (int i = 1; i <= 5; i++) {
			a = sc.nextInt( );
			sum += a;
		}

		System.out.print("��� : ");
		System.out.println(sum /= 5);
	}
}