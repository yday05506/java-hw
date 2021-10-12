package Array;
import java.util.Scanner;
public class Score_2 {
	public static void main( String args[ ] ) {
		Scanner scan = new Scanner(System.in);

		int a=1;
		String[] subj_name = {"국어", "영어", "수학", "자바", "C언어"};
		int[] subj = new int[subj_name.length+1];
		double avr;
		
		System.out.print("학번: ");
		String num = scan.next( );
		System.out.print("이름 : ");
		String name = scan.next( );

		for(int i = 0; i < subj.length-1; i++) {
			System.out.print(subj_name[i] + " : ");
			subj[i] = scan.nextInt( );
			while(subj[i] < 0 || subj[i] >= 100) {
					System.out.print("다시 입력하세요 : ");
					subj[i] = scan.nextInt();
					break;
			}
		}
		
		//총점
		for(int i = 0; i < subj.length-1; i++)
			subj[subj.length-1]+=subj[i];
		avr = (double)(subj[subj.length-1] / subj_name.length);
		
		System.out.println( );
		System.out.println("총점 : " + subj[subj.length-1]);
		System.out.println("평균 : " + avr);
		
		System.out.print("점수 : ");
		
		switch((int)avr/10) {
		case 10 : case 9 : System.out.print("A");
		break;
		case 8 : System.out.print("B");
		break;
		case 7 : System.out.print("C");
		break;
		case 6 : System.out.print("D");
		break;
		default : System.out.print("E");
		break;
		}
	}
}