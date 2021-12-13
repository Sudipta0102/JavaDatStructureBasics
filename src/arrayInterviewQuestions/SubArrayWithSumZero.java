package arrayInterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithSumZero {

	
	// apparently, 
	// 1. if the array of prefix sum contains
	// duplicate value 
	// 2. or 0
	// then subarray with sum 0 exists.
	private static boolean func(int[] a, int n) {
		// {4, 2, -3, 1, 6}
		// {4, 2, -6, 1, 6}
		// {4, 2, -3, -1, -2}
		// {4, 2, -3, 1, -1}
		
		int sum =0;
		Set<Integer> hs = new HashSet<>();
		
		for(int i=0;i<n;i++) {
			
			sum += a[i];//4,6,-1,0
			
			if(a[i]==0 || sum==0 || hs.contains(sum))
				return true;
			
			hs.add(sum);
			
		
		}
		
		return false;

	}
	
	public static void main(String[] args) {
		
		int a[] = {4, 2, -3, -1, -2};
		
		System.out.println(func(a, a.length));
	}
	
}
