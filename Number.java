package Exam;

public class Number {

	public static void main(String[] args) {
		//1~30
		int m = -1;
		int n = 31;
		int s;
		int[] cnt = new int[31];
		int bin = 0;
		int su = 0;
		
		for(int i = 1; i <= 50; i++) {
			//1~30, 0 29 +1
			s = (int)(Math.random()*30+1);	//0~0.999999999
			cnt[s]++;
			System.out.print(s + "\t");
			if(i % 10 == 0)
				System.out.println();
			if(s > m) m = s;
			if(s < n) n = s;
		}
		System.out.println();
		System.out.println("최댓값 : " + m + " 최솟값 : " + n);
		
		for(int i = 1; i <= 50; i++) {
			if(cnt[i] > bin) {
				bin = cnt[i];
				su = i;
			}
		}
		System.out.println("가장 빈도 수가 높은 수는 " + su + "(으)로 "+ bin + "번 발생");
	}

}
