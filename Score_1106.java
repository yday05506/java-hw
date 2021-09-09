package Array;
import java.util.Scanner;
public class Score_1106 {
	public static void main( String args[ ] ) {
		Scanner scan = new Scanner(System.in);

		int i=1;
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
		
		System.out.print("점수 : ");
		
		while(i <= java) {
			if(avr <= 100 || avr >= 90) {
				System.out.println("A");
				break;
			}
			else if (avr >= 80) {
					System.out.println("B");
					break;
			}
			else if (avr >= 70) {
				System.out.println("C");
				break;
			}
			else if (avr >= 60) {
				System.out.println("D");
				break;
			}
			else {
				System.out.println("E");
				break;
			}
		}
	}
}