public class Apple {
	public static void main( String args[ ] ) {
		int sum = 1;
		int chul = 7;
		int young = 5;
		for ( int i = 1; i <= 100; i++) {
			chul *= i;
			young *= i;
			sum = (chul * i) + (young * i);
			if(sum == 96) break;
		}
		System.out.println("Ã¶¼öÀÇ »ç°ú °¹¼ö : " + chul);
		System.out.print("¿µÈñÀÇ »ç°ú °¹¼ö : " + young);
	}
}