package Sorting;

import java.util.Arrays;

public class Bubbly {

	static void func(int[] a) {
		
		int n = a.length;
		
		for(int i =0;i<n-1;i++) {
			
			for(int j=0;j<n-1;j++) {
				
				if(a[j]>a[j+1]) {
					
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					
					//System.out.println(Arrays.toString(a)); 
				}
				
			}
			
		}
		
		System.out.println(Arrays.toString(a));
		
	}
	
	public static void main(String[] args) {
		
		int[] a = {34, 28, 42, 12, 8, 28, 22, 1};
		
		func(a);
		
	}
}
