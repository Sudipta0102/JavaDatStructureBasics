package arrays;

import java.util.Arrays;

public class SortAndSearchArray {
	
	public static void func(int[] a) {
		
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		
		//to use binary search the array must be sorted.
		System.out.println(Arrays.binarySearch(a, 12));
		
		
	}

	public static void main(String[] args) {
		
		int[] a = {39,36,12,17,8,32,29,69,20,78};
		
		func(a);
		
		
	}

}
