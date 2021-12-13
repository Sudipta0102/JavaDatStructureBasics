package arrays;

import java.util.Arrays;

public class TwoArraysAreEqual {
	
	public static void func(int[] a, int[] b) {
		
		
		System.out.println(Arrays.equals(a, b));
		
		
	}
	
	public static void funcAnother(int[] a, int[] b) {
		
		boolean result = true;
		
		if(a.length == b.length) {
			
			for(int i=0;i<a.length;i++) {
				
				if(a[i]!=b[i]) {
					
					result = false;
					break;
					
				}
				
			}
				
		}
		
		else {
			
			result = false;
			
		}
		
		if(result==true) {
			
			System.out.println("equal");
			
		}
		else {
			
			System.out.println("not equal");
		}
		
	}

	public static void main(String[] args) {
		
		int[] a = {23,24,12};
		int[] b = {23,24,12};
		
		func(a, b);
		
		funcAnother(a, b);

	}

}
