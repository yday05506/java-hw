package Array;
import java.util.Scanner;
public class Array2_score {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] score = new int[5][3];
		int win = 0;
		int add = 0;
		int max = 0;
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				score[i][j] = sc.nextInt();
				add += score[i][j];
				if(add > max) {
					max = add;
					win = i+1;
				}
			}
			add = 0;
		}
		
		System.out.print(win + "조 : " + max);
	}
}
