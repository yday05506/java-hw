import java.util.Scanner;
public class AddMethod {
	public static void main( String args[ ] ) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt( );
		int b = scan.nextInt( );
		int c = scan.nextInt( );
		int res = add(a, b, c);
		System.out.println(a + "+" + b + "+" + c + "=" + res);
	}
	static int add(int aa, int bb) {
		int result = aa + bb;
		return result;
	}
}