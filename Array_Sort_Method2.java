package Array;
import java.util.Scanner;
public class Array_Sort_Method2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int temp=0;
		
			System.out.print("데이터 갯수 입력 : ");
			int arr = sc.nextInt();
			int[] data = new int[arr];
			
			for(int i = 0; i < data.length; i++)
				data[i] = sc.nextInt();
			
			for(int i = 0; i <= data.length-1; i++) {
				System.out.print(data[i] + "\t");
			}
			System.out.println();
			
			sort(data);
			
			for(int k = 0; k < data.length; k++)
				System.out.print(data[k] + "\t");		
	}
	
	static void sort(int arr[]) {
		int temp;
		for(int i = arr.length-1; i >= 0; i--) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}