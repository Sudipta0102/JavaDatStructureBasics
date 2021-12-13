package arrays;

import javax.print.attribute.standard.MediaSize.NA;

public class MaximumOddNumberInArrayUsingStreamAndFilter {
	
	public static void func(int[] a) {
		
		int largest = a[0];
		int n = a.length;
		
		/*
		for(int i=0;i<n;i++) {
			
			if(a[i]%2!=0) {
				
				largest = a[i];
				break;
				
			}
			
		}
		*/
		for(int i=0;i<n;i++) {
			
			if(a[i]%2!=0 && largest<a[i]) {
				
				largest = a[i];
				
			}
			
		}
		
		System.out.println(largest);
	}
	
	public static void funcAnother(int[] a) {
		
		stream and filter jani Na...
	}
	
	
	public static void main(String[] args) {
		
		int[] b = {4,8,5,3,0,7,6,2,1};
		
		func(b);

	}

}
