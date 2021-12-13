package Sorting;

import java.util.Arrays;

public class Selection {

	static void selectionSort(int[] a) {
		
		int n = a.length;
		
		
		for(int i=0;i<n;i++) {
			
			int min = i;
			for(int j=i+1;j<n;j++) {
				
				if(a[min]>a[j]) {
					
					min = j;
					
				}
				
			}
			
			//swap(a[i], a[min]) 
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		
		System.out.println(Arrays.toString(a));
		
	}
	
	public static void main(String[] args) {
		
		int[] a = {64,25,12,22,11};
		
		selectionSort(a);
		
	}
	
}
