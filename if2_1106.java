import java.util.Scanner;
public class if2_1106 {
	public static void main( String args[ ] ) {
		Scanner sc = new Scanner(System.in);

		System.out.println("오늘의 요일을 입력하세요.");
		System.out.print("SUN(0), MON(1), TUE(2), WED(3), THU(4), FRI(5), SAT(6) : ");
		int a = sc.nextInt( );

		switch( a ) [
			case 0 : System.out.println("오늘은 SUNDAY입니다."); break;
			case 1 : System.out.println("오늘은 MONDAY입니다."); break;
			case 2 : System.out.println("오늘은 TUESDAY입니다."); break;
			case 3 : System.out.println("오늘은 WEDNESDAY입니다."); break;
			case 4 : System.out.println("오늘은 THURSDAY입니다."); break;
			case 5 : System.out.println("오늘은 FRIDAY입니다."); break;
			case 6 : System.out.println("오늘은 SATDAY입니다."); break;
			default : System.out.println("요일을 잘못 입력하셨습니다.");
		}

		/* if (a == 0)
			System.out.println("오늘은 SUNDAY입니다.");
		else if (a == 1)
			System.out.println("오늘은 MONDAY입니다.");
		else if (a == 2)
			System.out.println("오늘은 TUESDAY입니다.");
		else if (a == 3)
			System.out.println("오늘은 WEDNESDAY입니다.");
		else if (a == 4)
			System.out.println("오늘은 THURSDAY입니다.");
		else if (a == 5)
			System.out.println("오늘은 FRIDAY입니다.");
		else if (a == 6)
			System.out.println("오늘은 SATDAY입니다.");
		else
			System.out.println("요일을 잘못 입력하셨습니다.");
		*/

	}
}