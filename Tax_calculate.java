import java.util.Scanner;
public class Tax_calculate {
	public static void main( String args[ ] ) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�ٷμҵ� : ");
		int salary = sc.nextInt( );
		System.out.print("�ҵ漼�� ");

		if (salary <= 20000000)
			System.out.print((int)(salary * 0.05));
		else if (salary <= 40000000)
			System.out.print((int)(salary * 0.15));
		else if (salary <= 80000000)
			System.out.print((int)(salary * 0.25));
		else
			System.out.print((int)(salary * 0.4));

		System.out.println("���̴�.");
	}
}