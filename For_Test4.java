import java.util.Scanner;
public class For_Test4 {
	public static void main( String args[ ] ) {
		Scanner sc = new Scanner(System.in);
		System.out.print("팩토리얼 계산 수 입력 : ");
		int su = sc.nextInt( );
		int s = fact(su);
		System.out.println(s);
	}
	static int fact(int k) {
		int sum = 1;
		if(k==1) return 1;
		else return k+fact(k-1);
	}
}