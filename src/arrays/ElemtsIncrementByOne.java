package arrays;

import java.util.Arrays;

public class ElemtsIncrementByOne {

	public static void func(int[] a) {
		
		int n = a.length;
		
		for(int i=0;i<n;i++) {
			
			a[i] = a[i] + 1 ;
			
		}
		
		System.out.println(Arrays.toString(a));
	}
	
	
	public static void main(String[] args) {

		int[] a = {4,8,5,3,0,7,6,2,1};
		
		func(a);
		
		

	}

}
