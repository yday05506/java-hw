import java.util.Scanner;
public class Salary_Switch {
	public static void main( String args[ ] ) {
		Scanner sc = new Scanner(System.in);
		
		double raise = 0.0;
		double newSalary = 0.0;
		System.out.print("현 연봉을 입력하세요 : ");
		double currentSalary = sc.nextDouble( );
		System.out.print("근무평가등급을 입력하세요 : ");
		String rating = sc.next( );

		switch(rating) {
		case "우수" : 
		raise = currentSalary * 0.06;
		newSalary = currentSalary + raise;
		break;
		case "보통" : 
		raise = currentSalary * 0.04;
		newSalary = currentSalary + raise;
		break;
		case "불량" : 
		raise = currentSalary * 0.02;
		newSalary = currentSalary + raise;
		break;
		}

		System.out.println("연봉 인상액 : " + (int)raise);
		System.out.println("새 연봉 : " + (int)newSalary);
	}
}