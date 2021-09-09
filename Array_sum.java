package Array;

public class Array_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[100];
		int sum = 0;
		int b=1;
		for (int i = 0; i < a.length; i++) {
			a[i]=(i+1);
			if(a[i] % 2 == 0) {
				b=-1;
				a[i]*=b;
				System.out.print(a[i]);
			}
			else if (i==0) {
				System.out.print("1");
			}
			
			else {
				b=1;
				a[i]*=b;
				System.out.print("+"+a[i]);
			}
			sum += a[i];
		}
		System.out.print(" = "+sum);
	}

}

//package Array;
//
//public class Array_sum {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] a = new int[100];
//		int sum = 0;
//		for (int i = 1; i <= a.length; i++)
//		{
//			if (i % 2 == 0) {
//				sum -= i;
//				System.out.print("-"+i);
//			}
//			else if (i == 1) {
//				sum+=1;
//				System.out.print("1");
//			}
//			else {
//				sum += i;
//				System.out.print("+"+i);
//			}
//		}
//		System.out.println(" = "+sum);
//	}
//
//}