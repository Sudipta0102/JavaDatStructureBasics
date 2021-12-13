package Sorting;

import java.util.Arrays;

public class Insertion {

	static void insertionSort(int[] a) {
		
		int n = a.length;
		int j = 1;
		
		for(int i=0;i<n-1;i++) {
			
			
			j = i+1;
			int key = a[j];
					
			while(j>0 && a[j-1]>key) {
				
				a[j] = a[j-1];
				j--;
			
				System.out.println(Arrays.toString(a));
				
			}
			
			a[j] = key;
			
			System.out.println(Arrays.toString(a));
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		int[] a = {64,25,12,22,11};
		
		insertionSort(a);
		
	}
}
