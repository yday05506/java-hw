import java.util.Scanner;
public class Score_1 {
	public static void main( String args[ ] ) {
		String ch = "가을";
		switch (ch) {
			case "봄" :
			case "여름" : System.out.println("A"); break;
			case "가을" : System.out.println("B"); break;
			case "겨울" : System.out.println("C"); break;
		}
	}
}