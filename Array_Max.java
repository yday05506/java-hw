package Array;
import java.util.Scanner;
public class Array_Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] score = new int[10];
		System.out.print("입력 : ");
		for(int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
		}
		int max = score[0];
		for (int j = 1; j < score.length; j++)
		{
			if (score[j] > max)max = score[j];
		}
		System.out.println(max);
	}

}
