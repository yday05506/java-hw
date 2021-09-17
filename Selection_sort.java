public class Selection_sort {
	public static void main(String[] args) {
		int[] data = new int[] {3, 2, 4, 7, 1};
		int temp=0;
		
		for(int i = 0; i < data.length; i++) { //i´Â 3±îÁö
			System.out.print(data[i] + " ");
			for(int j = i+1; j < data.length; j++) {
				if(data[i] > data[j]) {
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		System.out.println(data[i]);
		}
	}

}
