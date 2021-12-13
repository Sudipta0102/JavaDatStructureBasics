package arrayInterviewQuestions.Array50GFG.Level2;

public class CountPairsOfGivenSum {
	//the idea is like you run two pointers
	//1. one is, regular increment counter
	//2. other is for resetting regular counter to this pointer's
	//position and also it denotes the first number to be summed with.
	//3. regular increment counter increments and check that value 
	//summed with the start pointer gives the sum resulting incrementing 
	//the count
	//4. repeat this process for entire array, when the first
	//pointer(start) hits the end of the array. then their 
	//is nothing to check. At this point if the count is zero then 
	// there are no pairs with given sum else return count.
	static void func(int[] a, int sum) {
		//{1, 5, 7, 1}
		int start = 0;
		int n = a.length;
		int count = 0;
		
		for(int i=1;i<n;i++) {
			
			if(a[start]+a[i]==sum) {
				
				System.out.println(start+", "+i);
				count++;
				
			}
			if(start!=n-1 && i==n-1) {
				
				start++;
				i = start;
			}
			if(start == n-1) {
				if(count==0)
					System.out.println("There is no pair with given sum");
				break;
			}
		}
		
		System.out.println(count);
		
	}
	
	public static void main(String[] args) {
		
		int[] a = {1, 5, 7, 1};
		int[] b = {1,1,1,1};
		
		func(b, 2);
		
	}

}
