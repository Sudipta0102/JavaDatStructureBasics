package arrays;

import java.util.Arrays;

public class MergeTwoArraysToObjectArray {
	
	public static void func(int[] a, int[] b) {
		
		Object[] c = new Object[a.length+b.length];
		int j=0;
		int l=0;
		
		for(int i=0;i<a.length;i++) {
			
			//if(j<a.length) {
				
				c[i] = a[i];
				//j++;
				
			//}
		}
		
		for(int k=a.length;k<a.length+b.length;k++) {
			
			c[k] = b[l];
			l++;
			
		}
		
		System.out.println(Arrays.toString(c));
	}

	public static void main(String[] args) {

		int[] a = {1,2,3,4,5};
		int[] b = {4,5,6,7,8};

		func(a, b);
	}

}
