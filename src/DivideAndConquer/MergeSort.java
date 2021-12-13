package DivideAndConquer;

import java.util.Arrays;

public class MergeSort {

	static void merge(int[] a, int l, int m, int r) {
		
		int n1 = m-l+1;
		int n2 = r-m;
		
		int left[] = new int[n1];
		int right[] = new int[n2];
		
		for(int i=0;i<n1;i++) {
			
			left[i] = a[l+i];
			
		}
		
		for(int i=0;i<n2;i++) {
			
			right[i] = a[m+1+i];
		
		}
		
		int x=0, y=0;
		int z=l;
		
		while(x<n1 && y<n2) {
			
			if(left[x]<+right[y]) {
				
				a[z] = left[x];
				x++;
			}
			else {
				
				a[z] = right[y];
				y++;
				
			}
			
			z++;
		}
				
		while(x<n1) {
			
			a[z] = left[x];
			x++;
			z++;
		}
		
		while(y<n2) {
			
			a[z] = right[y];
			y++;
			z++;
		}
		
	}
	
	static void sort(int[] a, int l, int r) {
		
		if(l<r) {
			
			int m = (r-l)/2+l;
			
			sort(a, l, m);
			sort(a, m+1, r);
			
			merge(a, l, m, r);
		}
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = { 12, 11, 13, 5, 6, 7 };
		
		System.out.println(Arrays.toString(arr));
		
		sort(arr, 0, arr.length-1);
		
		System.out.println(Arrays.toString(arr));
		
	}
	
}
