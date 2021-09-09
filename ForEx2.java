package Array;
public class ForEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[100];
		int sum = 0;
		
		for(int i = 0; i < a.length; i++)
		{
			a[i] = (i+1);
			if (i == 0) System.out.print("1"); 
			else System.out.print("+"+a[i]);
			sum += a[i];
		}
		System.out.print(" = " + sum);

	}

}