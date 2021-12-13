package arrayInterviewQuestions;

public class PeakElement {

	static int func(int[] a) {
		
		int n = a.length;
		
		for(int i=0;i<n-1;i++) {
			
			if(a[i+1]>a[i]) {
				
				return 1;
				
			}
			
		}
		
		
		return 0;
		
	}
	
	public static void main(String[] args) {
		
		int[] a = {2,1,0,4,3};
		
		int[] b = {3,2,1};
		
		System.out.println(func(a));
		
		System.out.println(func(b));
		
	}
	
}
