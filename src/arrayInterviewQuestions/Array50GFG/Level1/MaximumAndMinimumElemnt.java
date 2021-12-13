package arrayInterviewQuestions.Array50GFG.Level1;

public class MaximumAndMinimumElemnt {

	static void func(int[] a) {
		
		int largest = a[0];
		int smallest = a[0];
		int n = a.length;
		
		for(int i=1;i<n;i++) {
			
			if(smallest>a[i])
				smallest = a[i];
			
			if(largest <a[i])
				largest = a[i];
			
		}
		
		System.out.println(smallest);
		System.out.println(largest);
	}
	
	public static void main(String[] args) {
		
		int [] a = {3,2,1,0,5};
		
		func(a);
	}
	
}
