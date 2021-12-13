package arrays;

import java.util.Arrays;
import java.util.Collections;

public class MaxOrMinValueInArrayOfPrimitivesUsingLibrary {
	
	public static void func(Integer[] a) {
		
		
		int min = Collections.min(Arrays.asList(a));
		
		System.out.println(min);
		
		int max = Collections.max(Arrays.asList(a));
		
		System.out.println(max);
		
	}

	public static void main(String[] args) {

		Integer[] a = {1,6,3,2,8,3,5,4,2,6,4,5,7,6,1,2,0,8,9}; 
		
		func(a);

	}

}
