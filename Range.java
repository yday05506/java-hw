package Exam;

import java.util.Scanner;

public class Range {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[50];
		int ind = 0;
		int add = 0;
		
		//입력
		while(true) {
			System.out.print("수 입력 : ");
			int a = sc.nextInt();
			if(a >= 10 && a <= 30) {
				n[ind++] = a;	//0번 방 -> 1번 방 -> 2번 방
				add += a;
			}
			else if (a == 0)
				break;
		}
		
		//출력
		System.out.print("10 ~ 30 사이의 수 : ");
		for(int i = 0; i < ind; i++) 
			System.out.print(n[i] + "\t");
		System.out.println();
		System.out.print("총합 : " + add);
	}

}
