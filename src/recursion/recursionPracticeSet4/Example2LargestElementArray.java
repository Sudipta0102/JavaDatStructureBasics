package recursion.recursionPracticeSet4;

public class Example2LargestElementArray {
	
	public static void func(int[] a, int n) {
	
		if(n<0) {
			return;
		}
		else {
			
			func(a, n-1);
			
		}
		
		System.out.println(a[n]);
		
	}
	
	static int funcLargest(int[] a, int n) {
		
		int x;
		if(n==0) {
			
			return a[0];
			
		}
		
			
			x = funcLargest(a, n-1);
			
		if(x>a[n-1]) {
			
			return x;
			
		}
		else {
			
			return a[n-1];
		}

		
		
	}

	public static void main(String[] args) {
		
		int arr[] = {12, 10, 30, 50, 100};
		
		System.out.println(funcLargest(arr, 5));
		
		//System.out.println(" "+ func(arr, 5));

	}

}
