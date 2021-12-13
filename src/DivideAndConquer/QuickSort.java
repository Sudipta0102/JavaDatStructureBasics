package DivideAndConquer;

import java.util.Arrays;

public class QuickSort {

	static void swap(int[] a, int i, int j) {
		
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
	}
	
	static int partition(int[] a, int low, int high) {
		
		//selecting the last item as pivot
		int pivot = a[high];
		
		int i = low-1;
		
		for(int j=low;j<high;j++) {
			
			if(a[j]<pivot) {
				
				i++;
				swap(a, i, j);
				
			}
			
		}
		
		//swapping the pivot 
		swap(a, i+1, high);
		
		return i+1;
	}
	
	static void sort(int[] a, int low, int high) {
		
		if(low<high) {
			
			int pivot = partition(a, low, high);
			
			sort(a, low, pivot-1);
			sort(a, pivot+1, high);
			
			
		}
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = { 12, 5, 11, 13, 7, 6, 5 };
		
		System.out.println(Arrays.toString(arr));
		
		sort(arr, 0, arr.length-1);
		
		System.out.println(Arrays.toString(arr));
		
	}
	
}
