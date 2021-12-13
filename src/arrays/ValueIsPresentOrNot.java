package arrays;

import java.util.Arrays;

public class ValueIsPresentOrNot {

	public static void func(int[] a, int value) {
		
		Arrays.sort(a);
		
		int idx = Arrays.binarySearch(a, value);
		
		if(idx>=0) {
			
			System.out.println(value+" is at index: "+ (idx+1));
			
		}
		else {
			
			System.out.println("Element is not present is the array");
		}
		
	}
	
	
	public static void main(String[] args) {

		int[] a = {1,2,4};
		
		func(a, 4);

	}

}
