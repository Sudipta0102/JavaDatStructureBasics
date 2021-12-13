package Sorting;

import java.util.Arrays;

public class Heap {

	static void heapify(int[] a, int n, int i) {
		
		int largest = i;
		int l = 2*i+1;
		int r = 2*i+2;
		
		if(l<n && a[largest]<=a[l]) {
			
			largest = l;
			
		}
		
		if(r<n && a[r]>a[largest]) {
			
			largest = r;
		}
		
		if(i!=largest) {
			
			int temp= a[largest];
			a[largest] = a[i];
			a[i] = temp;
			
			heapify(a, n, largest);
		}
	}
	
	static void heapSort(int[] a) {
		
		for(int i = a.length/2 - 1;i>=0;i--) {
			
			heapify(a, a.length, i);
			
		}
	
		for(int i=a.length-1;i>0;i--) {
			
			int temp = a[i];
			a[i] = a[0];
			a[0] = temp;
			
			heapify(a, i, 0);
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		int[] a = {34, 28, 42, 12, 8, 28, 22, 1};
		
		System.out.println(Arrays.toString(a));
		
		heapSort(a);
		//heapify(a, a.length-1, 0);
		
		System.out.println(Arrays.toString(a));
		
	}
}
