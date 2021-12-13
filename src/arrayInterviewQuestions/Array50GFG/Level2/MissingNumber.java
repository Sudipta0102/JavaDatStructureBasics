package arrayInterviewQuestions.Array50GFG.Level2;

import java.util.Arrays;

public class MissingNumber {

	static void func(int[] a) {
		//{6,1,2,8,3,4,7,10,5}
		int start = 0;
		int n = a.length;
		
		for(int i=0;i<n;i++) {
			
			if(a[i]==a[start]+1) {
				
				start++;
				i = start;
				
			}
			
			if(start<n-1 && i==n-1) {
				
				System.out.println((a[start]+1)+" is the missing number");
				break;
			}
			
			if(start==n-1) {
				
				System.out.println("There is no missing number");
				break;
			}
		}
		
		
	}
	
	public static void main(String[] args) {
	
		 int[] a = {6,1,2,8,3,4,7,10,5};
		 int A[] = {1,2,3,4};
		
		 System.out.println(Arrays.toString(A));
		 
		 func(A);
	}
}
