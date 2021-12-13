package arrays;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void func(int[] a, int[] b) {
		
		int[] c = new int[a.length + b.length];
		int j =0;
		
		for(int i=0;i<a.length;i++) {
			
			c[i] = a[i];
			
		}
		
		for(int i=a.length;i<(a.length+b.length)-1;i++) {
			
			if(j<b.length) {
				c[i] = b[j];
				j++;
			}		
		}
		
		System.out.println(Arrays.toString(c));
		
	}
	
	//using System.arrayCopy()
	public static void funcLast(int[] a, int[] b) {
		
		int[] c = new int[a.length+b.length];
		
		
		
	}
	
	public static void main(String[] args) {
		
		int[] a = {0,1,2,3,4,5};
		int[] b = {6,7,8,9,0};
		
		func(a,b);

	}

}
