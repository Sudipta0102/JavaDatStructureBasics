package arrayInterviewQuestions.Array50GFG.Level1;

import java.util.Arrays;

public class SortAnArrayNLogN {

	static void mergeSort(int[] a, int l, int r) {
		
		if(l<r) {
			int mid = (l+r)/2;
			mergeSort(a, l, mid);
			mergeSort(a, mid+1, r);
			merge(a, l, r, mid);
		}
				
	}
	

	static void merge(int[] a, int l, int r, int m) {
		
		int n1 = m-l+1;
		int n2 = r-m;
		
		int[] x = new int[n1];
		int[] y = new int[n2];
		
		for(int i=0;i<n1;i++)
			x[i] = a[l+i];
		
		
		for(int i=0;i<n2;i++)	
			y[i] = a[m+1+i];
			
		
		
		int i = 0, j = 0, k = l; 
		
		while(i<n1 && j<n2) {
			if(x[i]<=y[j])
				a[k++] = x[i++];
			else	
				a[k++] = y[j++];		
		}
		
		while(i<n1) 	
			a[k++] = x[i++];
				
		while(j<n2) 	
			a[k++] = y[j++];
			
		
		
	}
	
	public static void main(String[] args) {
		
		int [] a = {3,5,1,0,5};
		
		System.out.println(Arrays.toString(a));
		
		mergeSort(a, 0, a.length-1);
		
		System.out.println(Arrays.toString(a));
	}
}
