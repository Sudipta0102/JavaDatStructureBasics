package arrayInterviewQuestions;

import java.util.Arrays;
import java.util.Collections;

/*
 * 1st approach is to sort and return kth element
 */



public class KthSmallest {

	static int funcOneSmallest(int[] a, int kth) {
		
		Arrays.sort(a);
		
		return a[kth-1];
		
	}
	
	static int funcTwoLargest(int[] a, int kth) {
		
		Arrays.sort(a);
		
		return a[a.length-kth];
		
	}
	
	static void func(int[] a, int kth) {
		
		int n = a.length;
		
		for(int i=0;i<n;i++) {
			
			
			
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] a = {2,1,0,4,3};
		
		System.out.println(funcOneSmallest(a, 3));
		
		System.out.println(funcTwoLargest(a, 2));
		
	}
}
