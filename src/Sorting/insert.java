package Sorting;

import java.util.Arrays;

public class insert {

	static void func(int[] a) {
		
		int n = a.length;
		int j = 0;
		
		for(int i=0;i<n-1;i++) {
			
			j = i+1;
			int key = a[j];
			
			while(j>0 && key<a[j-1]) {
				
				a[j] = a[j-1];
				j--;
			
				//System.out.println(Arrays.toString(a));
			}
			
			a[j] = key;
			//System.out.println(Arrays.toString(a));
		}
		
		
		System.out.println(Arrays.toString(a));
	}
	
	public static void main(String[] args) {
		
		int[] a = {34, 28, 42, 12, 8, 22};
		
		System.out.println(Arrays.toString(a));
		
		func(a);
		
	}
}
