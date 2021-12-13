package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseAnArray {
	
	public static void func(int[] a) {
		
		int n = a.length;
		
		for(int i=0;i<=n/2;i++) {
			
			int temp = a[n-1-i];
			a[n-1-i] = a[i];
			a[i] = temp;
			
		}
		
		System.out.println(Arrays.toString(a));
	}
	
	//using library
	public static void funcLibrary(Integer[] a) {
		
		Collections.reverse(Arrays.asList(a));
		
		System.out.println(Arrays.asList(a));
		
		
		
		
		
	}

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		
		func(a);
		
		Integer[] b = {1,2,3,4,5};

		funcLibrary(b);
		
	}

}
