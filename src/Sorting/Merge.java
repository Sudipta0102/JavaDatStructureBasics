package Sorting;

import java.util.Arrays;

public class Merge {

	void mergeSort(int[] a, int l, int r) {
		
		if(l==r) {
			
			return;
			
		}
		else {
			
			int m = (l+r)/2;
			mergeSort(a, l, m);
			mergeSort(a, m+1, r);
			merge(a, l,m,r);
		}
		
		
	}
	
	
	void merge(int[] a, int l, int m, int r) {
		
		int n1 = m-l+1;
		int n2 = r-m;
		
		System.out.println("array: "+Arrays.toString(a));
		
		System.out.println("Sub-Array: "+Arrays.toString(Arrays.copyOfRange(a, l, r)));
		
		int[] left = new int[n1];
		int[] right = new int[n2];
		
		for(int i=0;i<n1;i++) {
			
			left[i] = a[l+i];
			
		}
		
		System.out.println("left: "+Arrays.toString(left));
		
		for(int i=0;i<n2;i++) {
			
			right[i] = a[m+1+i];
			
		}
		
		System.out.println("right: "+Arrays.toString(right));
		
		int i=0;
		int j=0;
		
		int k=l;
		
		while(i<n1 && j<n2) {
			
			if(left[i]<=right[j]) {
				
				a[k] = left[i];
				i++;
				
			}
			else {
				
				a[k] = right[j];
				j++;
			}
			k++;
		}
		
		while(i<n1) {
			
			a[k] = left[i];
			i++;
			k++;
			
		}
		
		while(j<n2) {
			
			a[k] = right[j];
			j++;
			k++;
		}
	}
	
	void merge1(int[] a, int l, int m, int r) {
		
		int i=l;
		int j=m+1;
		int k=l;
		
		int[] b = new int[a.length];
		
		while(i<=m && j<=r) {
			
			if(a[i]<=a[j]) {
				
				b[k] = a[i];
				i++;
				
			}
			else {
				
				b[k] = a[j];
				j++;
				
			}
			k++;
		}
		
		while(i<m) {
			
			b[k] = a[i];
			i++;			
		}
		
		while(j<r) {
			
			b[k] = a[j];
			j++;
		}
		
		System.out.println(Arrays.toString(b));
		
	}
	
	public static void main(String[] args) {
		
		int[] a = {12,5,23,19,9,4};
		Merge sort = new Merge();
		
		sort.mergeSort(a, 0, a.length-1);
		
		System.out.println(Arrays.toString(a));
		
	}
	
	
}
