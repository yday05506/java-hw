import java.util.Scanner;
public class SwitchExam5 {
	public static void main( String args[ ] ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �Է� : ");
		int a = sc.nextInt( );

		switch(a) {
		case 1 : case 2 :
			a = "���̵�����Ʈ�����"; break;
		case 3 : case 4 :
			a = "���̵�����ַ�ǰ�"; break;
		case 5 : case 6 :
			a = "���̵������ΰ�"; break;
		default :
			a = "�Էµ� ���� �������� �ʽ��ϴ�.";
		}

		System.out.println(c);
	}
}	