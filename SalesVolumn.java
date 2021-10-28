package Exam;

import java.util.Scanner;

//1106 양다연
public class SalesVolumn {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int month = 12;
		int[][] sale = new int [3][month +2];
		String[] year = {"2018", "2019", "2020"};
		int yearsale = month;
		int addsale = month+1;
		int max = 0;
		
		//입력
		for(int i = 0; i < sale.length; i++) {
			System.out.print(year[i] + "년도 : ");
			for(int j = 0; j < sale[i].length-2; j++) {
					sale[i][j] = sc.nextInt();
			}
			sale[i][yearsale] = 0;
			sale[i][addsale] = 0;
		}
		
		//연간 판매량
		
		for(int i = 0; i < sale.length; i++) {
			for(int j = 0; j < sale[i].length-2; j++)
				sale[i][yearsale] += sale[i][j];
		}
		
		//누적 판매량
		for(int i = 0; i < sale.length; i++) {
				max += sale[i][yearsale];
				sale[i][addsale] = max;
		}
		
		//출력
		for(int i = 0; i < month; i++) {
			System.out.print("	" + (i+1) + "월");
		}
		System.out.print("\t" + "연간판매량");
		System.out.print("\t" + "누적판매량");
		System.out.println();
		
		for(int i = 0; i < sale.length; i++) {
			System.out.print(year[i] + "년도 : \t");
			for(int j = 0; j < sale[i].length-2; j++) {
				System.out.print(sale[i][j] + "\t");
			}
			System.out.print(sale[i][yearsale] + "\t");
			System.out.print(sale[i][addsale] + "\t");
			System.out.println();
		}
		
	}

}
