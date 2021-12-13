package arrayInterviewQuestions;

import java.util.Arrays;

public class ReverseTheArray {

	static void func(int[] a) {
		
		int n = a.length;
		
		for(int i=0;i<n/2;i++) {
			
			int temp = a[i];
			a[i] = a[n-i-1];
			a[n-i-1] = temp;
			
		}
		
		System.out.println(Arrays.toString(a));
		
	}
	
	public static void main(String[] args) {
		
		int[] a = {2,1,0,4,3};
		
		func(a);
	}
	
}
