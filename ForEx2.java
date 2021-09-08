
public class ForEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[100];
		a[0] = 0;
		int sum = 0;
		
		for(int i = 1; i <= a.length; i++)
		{
			sum += i;
			if (i == 1)
				System.out.print("1");
			else
				System.out.print("+"+i);
		}
		System.out.print(" = " + sum);

	}

}
