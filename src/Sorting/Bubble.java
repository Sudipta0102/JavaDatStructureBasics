package Sorting;

import java.util.Arrays;

public class Bubble {

	static void bubbleSort(int[] a) {
		
		int n = a.length;
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n-1-i;j++) {
				
				if(a[j]>a[j+1]) {
					
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					
				}
				
			}
					
		}
		
		System.out.println(Arrays.toString(a));
		
	}
	
	static void selectionSortPractice(int[] a) {
		
		int n = a.length;
		
		for(int i=0;i<n;i++) {
			
			int min = i;
			
			for(int j=i+1;j<n;j++) {
				
				if(a[min]>a[j]) {
					
					  min = j;
					
				}
				
			}
			
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		
			System.out.println(Arrays.toString(a));
			
		}
		

		
	}
	
	
	public static void main(String[] args) {
		
		int[] a = {64,25,12,22,11};
		
		//bubbleSort(a);
		
		selectionSortPractice(a);
		
	}
}
