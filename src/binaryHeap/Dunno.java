package binaryHeap;

import java.util.Arrays;

public class Dunno {


	static void func(int[] a, int n, int i) {
		
		int n = a.length;
		int largest = 0;
		//int i = n/2-1;
		
		
		
		while (true) {

			int l = 2 * i + 1;
			int r = 2 * i + 2;

			if (l < n && a[i] < a[l]) {

				largest = l;
			} 

			if (r < n && a[r] > a[largest]) {

				largest = r;
			} 

			if (largest == i) {

				break;
			}	
				
			int temp = a[largest];
			a[largest] = a[i];
			a[i] = temp;

			System.out.println(Arrays.toString(a));
			i=largest;
		}
		
			System.out.println(Arrays.toString(a));
	}
	
	
	public static void main(String[] args) {
		
		int[] a = {9,8,6,5,2,1};
		
		int[] b = {1,2,5,6,8,9};
		
		System.out.println(b.length);
		
		func(b);
		
	}
	
}
