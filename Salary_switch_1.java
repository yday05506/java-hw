import java.util.Scanner;
public class Salary_switch_1 {
	public static void main( String args[ ] ) {
		Scanner sc = new Scanner(System.in);

		double raise = 0.0;
		double newSalary = 0.0;
		System.out.print("�� ������ �Է��ϼ��� : ");
		double currentSalary = sc.nextDouble( );
		System.out.print("�ٹ��򰡵���� �Է��ϼ��� : ");
		String rating = sc.next( );
		setRating(rating, currentSalary);
	}

	static void setRating(String rating, double currentSalary) {
		double raise = 0;
		double newSalary = 0;
		switch(rating) {
			case "���" : 
			raise = currentSalary * 0.06;
			newSalary = currentSalary + raise;
			break;
			case "����" : 
			raise = currentSalary * 0.04;
			newSalary = currentSalary + raise;
			break;
			case "�ҷ�" : 
			raise = currentSalary * 0.02;
			newSalary = currentSalary + raise;
			break;
		}
		System.out.println("���� �λ�� : " + (int)raise );
		System.out.println("�� ���� : " + (int)newSalary );
	}
}