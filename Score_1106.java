import java.util.Scanner;
public class Score_1106 {
	public static void main( String args[ ] ) {
		Scanner scan = new Scanner(System.in);

		int kor, eng, math, java;
		int add; 
		double avr;		
		
		System.out.print("학번 : ");
		String num = scan.next( );
		System.out.print("이름 : ");
		String name = scan.next( );

		System.out.print("국어 : ");
		kor = scan.nextInt( );
		System.out.print("영어 : ");
		eng = scan.nextInt( );
		System.out.print("수학 : ");
		math = scan.nextInt( );
		System.out.print("자바 : ");
		java = scan.nextInt( );
		
		//총점
		add = (kor + eng + math + java);
		avr = (double)add / 4;
		
		System.out.println( );
		System.out.println("총점 : " + add);
		System.out.print("평균 : " + avr);
		
		System.out.print("평점 : ");
		switch((int)avr/10) {	// 0 ~ 100    99.999999
			case 10 :
			case 9 : System.out.println("A"); break;
			case 8 : System.out.println("B"); break;
			case 7 : System.out.println("C"); break;
			case 6 : System.out.println("D"); break;
			default : System.out.println("E");
		}

		//평균 A(90 이상) B(80 이상) C(70 이상) D(60 이상) E(나머지)
		/* System.out.print("평점 : ");
		if (avr >= 90) System.out.println("A"); 
		else 	if (avr >= 80) System.out.println("B");
		else 	if(avr >= 70) System.out.println("C");
		else 	if (avr >= 60) System.out.println("D");
		else System.out.println("E");
		*/
	}
}