
public class Array_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[100];
		int i = 0;
		a[0] = 0;
		int sum = 0;
		for (i = 1; i <= a.length; i++)
		{
			if (i % 2 == 0) {
				sum -= i;
				System.out.print("-"+i);
			}
			else if (i == 1) {
				sum+=1;
				System.out.print("1");
			}
			else {
				sum += i;
				System.out.print("+"+i);
			}
		}
		System.out.println(" = "+sum);
	}

}
