import java.util.Scanner;
public class if1_1106 {
	public static void main( String args[ ] ) {
		Scanner sc = new Scanner(System.in);
			
		System.out.print("가위(1), 바위(2), 보(3) 입력 : ");
		int a = sc.nextInt( );

		switch(a) {
			case 1 : System.out.print("당신은 가위를 "); break;
			case 2 : System.out.print("당신은 바위를 "); break;
			case 3 : System.out.print("당신은 보를 "); break;
			default : System.out.print("잘못 ");
		}

		/* if (a == 1)
			System.out.print("당신은 가위를 ");
		else if (a == 2)
			System.out.print("당신은 바위를 ");
		else if (a == 3)
			System.out.print("당신은 보를 ");
		else
			System.out.print("잘못 ");
		*/

		System.out.print("내셨습니다.");
	}
}