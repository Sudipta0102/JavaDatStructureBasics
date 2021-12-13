package Sorting;

import java.util.Arrays;

public class Select {

	static void func(int[] a) {
		
		int n = a.length;
		
		for(int i=0;i<n;i++) {
			
			int  min = i;
			
			for(int j=i+1;j<n;j++) {
	
				if(a[min]>a[j]) {
					
					min = j;
					
				}				
			}

			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
			
		}
		
		
		System.out.println(Arrays.toString(a));
	}
	
	public static void main(String[] args) {
		
		int[] a = {34, 28, 42, 12, 8, 28, 22};
		
		System.out.println(Arrays.toString(a));
		
		func(a);
		
	}
	
}
