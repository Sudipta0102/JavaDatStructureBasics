package arrayInterviewQuestions.Array50GFG.Level2;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

	void quickSort(int[] a) {
		
		quickSort(a, 0, a.length-1);
		
	}
	
	void quickSort(int[] a, int l, int r) {
		
		if(l<r+1) {
	
			int p = partition(a, l, r);
			quickSort(a, l, p-1);
			quickSort(a, p+1, r);
			
			
		}
		
	}
	
	void swap(int[] a, int x, int y) {
		
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
			
	}
	
	int getPivot(int l, int r) {
		
		Random random = new Random();
		//here the (+l) part is for the right side of the pivot
		return random.nextInt((r-l)+1)+l;
		
	}
	
	int partition(int[] a, int l, int r) {
		
		swap(a, l, getPivot(l, r));//now, pivot is the left most value
		
		int border = l+1;//starting point is the subsequent element of pivot
		
		for(int i=border;i<=r;i++) {
			//idea is to take all the lower than pivot to the left of the pivot.
			//to achieve that, along the way if any element lower than
			//the pivot is encountered, swapping is done with the left most 
			//available cell.
			if(a[i]<a[l]) { //a[l] is the pivot here
				
				swap(a, i, border);
				border++;
			}
		}
		
		//here, swapping the pivot to its right place
		swap(a, l, border-1); 
		
		//returning the index of pivot value
		return border-1;
		
	}
	
	public static void main(String[] args) {
		
		int a[] = { 2, 4, 1, 3, 1, -2};
		
		QuickSort obj = new QuickSort();
		
		System.out.println(Arrays.toString(a));
		
		obj.quickSort(a);
		
		System.out.println(Arrays.toString(a));
	}
	
}
