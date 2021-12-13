package arrayInterviewQuestions;

public class MissingNumber {

	static void func(int[] a) {
		
		int n = a.length;
		
		for(int i=0;i<n-1;i++) {
			
			if(a[i+1] != a[i]+1) {
				
				System.out.println((a[i]+1)+" is missing");
				break;
				
			}
			
			if(i==n-2) {
				
				System.out.println("Nothing is missing");
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		int A[] = {1,2,3,4,5,6,7,8,10};
		
		func(A);
	}
	
}
