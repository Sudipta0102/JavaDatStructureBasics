package recursion;

import java.util.Arrays;

public class SelectionSort {

	static int[] func(int[] a, int i , int j, int minIdx) {
		
		if(i==a.length) {
			return a;
		}			
		if(j<a.length) {			
			if(a[minIdx]>a[j])		
				minIdx = j;
			
			return func(a, i, j+1, minIdx);
		}
		
		else {
			//swap a[i], a[minIdx]
			int temp = a[i];
			a[i] = a[minIdx];
			a[minIdx] = temp;
			
			
			
			return func(a, i+1, i+1, i+1);
		}
	}
	
	public static void main(String[] args) {
		
		int[] a = {5,4,3,2,1};
		int[] b = {3,4,1,6,3,8};
		
		System.out.println(Arrays.toString(b));
		
		System.out.println(Arrays.toString(func(b, 0, 0, 0)));
		
	}
}
