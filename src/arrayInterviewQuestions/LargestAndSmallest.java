package arrayInterviewQuestions;

public class LargestAndSmallest {

	static void func(int[] a) {
		
		int smallest = a[0];
		int largest = a[0];
		int n = a.length;
		
		
		for(int i=0;i<n;i++) {
			
			if(largest<a[i]) {
				
				largest = a[i];
				
			}
			
			if(smallest>a[i]) {
				
				smallest = a[i];
				
			}
		}
		
		System.out.println(largest);
		
		System.out.println(smallest);
		
	}
	
	
	public static void main(String[] args) {
		
		int[] a = {2,1,0,4,3};
		
		func(a);
		
	}
	
}
