package binaryHeap;

import java.util.Arrays;

public class Heapify_Max {

	
	static void heapify(int a[], int n, int i) {
		
		int largest = i;
		int l = 2*i+1;
		int r = 2*i+2;
		
		if(l<n && a[l]>a[largest]) {
			
			largest = l;
			
		}
		
		if(r<n && a[r]>a[largest]) {
			
			largest = r;
			
		}
		
		if(largest != i) {
			
			int temp = a[i];
			a[i] = a[largest];
			a[largest] = temp;
		
			
			heapify(a, n, largest);
		}
		
		
	}

	static void buildHeap(int a[], int n) {
		
		for(int i = n/2-1;i>=0;i--) {
			
			heapify(a, n, i);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = { 1, 3, 5, 4, 6, 13, 10,
                9, 8, 15, 17 };

		int n = arr.length;
		
		buildHeap(arr, n);
		
		for(int i=0;i<n;i++) {
			
			System.out.print(arr[i]+" ");
			
		}
		
		//System.out.println(Arrays.toString(arr));
		
	}
	
	
}
