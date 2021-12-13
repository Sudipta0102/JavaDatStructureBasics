package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
	
	public static void func(int[] a) {
		
		List<Integer> l = new ArrayList<>(a.length);
		
		for(int i =0;i<a.length;i++) {
			
			l.add(a[i]);
			
		}
		
		System.out.println(l);
		
	}
	
	public static void funcAnother(Integer[] a) {
		
		List<Integer> l = Arrays.asList(a);
		
		System.out.println(l);
		
	}
	
	public static <T> void funcGenericArray(T[] a) {
		
		List<T> l = Arrays.asList(a);
		
		System.out.println(l);
		
	}

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4};

		func(a);
		
		Integer[] aa = {1,2,3,4};
		
		funcAnother(aa);
		
		funcGenericArray(aa);
	}

}
