import java.util.Scanner;
public class Score_1106 {
	public static void main( String args[ ] ) {
		Scanner scan = new Scanner(System.in);

		int kor, eng, math, java;
		int add; 
		double avr;		
		
		System.out.print("�й� : ");
		String num = scan.next( );
		System.out.print("�̸� : ");
		String name = scan.next( );

		System.out.print("���� : ");
		kor = scan.nextInt( );
		System.out.print("���� : ");
		eng = scan.nextInt( );
		System.out.print("���� : ");
		math = scan.nextInt( );
		System.out.print("�ڹ� : ");
		java = scan.nextInt( );
		
		//����
		add = (kor + eng + math + java);
		avr = (double)add / 4;
		
		System.out.println( );
		System.out.println("���� : " + add);
		System.out.print("��� : " + avr);
		
		System.out.print("���� : ");
		switch((int)avr/10) {	// 0 ~ 100    99.999999
			case 10 :
			case 9 : System.out.println("A"); break;
			case 8 : System.out.println("B"); break;
			case 7 : System.out.println("C"); break;
			case 6 : System.out.println("D"); break;
			default : System.out.println("E");
		}

		//��� A(90 �̻�) B(80 �̻�) C(70 �̻�) D(60 �̻�) E(������)
		/* System.out.print("���� : ");
		if (avr >= 90) System.out.println("A"); 
		else 	if (avr >= 80) System.out.println("B");
		else 	if(avr >= 70) System.out.println("C");
		else 	if (avr >= 60) System.out.println("D");
		else System.out.println("E");
		*/
	}
}