package arrayInterviewQuestions.Array50GFG.Level2;

public class MaximumSumSubArrayKadaneAlgo {

	static void func(int a[]) {
		
		int n = a.length;
		
		int max = 0;
		int maxNow = 0;
		int start=0, end=0;
		
		for(int i =0;i<n;i++) {
			
			maxNow += a[i];
			
			if(maxNow<0) {
				
				maxNow = 0;
				start = i+1;
			}
			
			if(maxNow>max) {
				
				max = maxNow;
				end = i;
			}
		}
		
		System.out.println("Maximum Sum: "+max);
		System.out.println("start: "+start);
		System.out.println("end: "+end);
	}
	
	public static void main(String[] args) {
		
		int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		
		func(a);
	}
	
}
