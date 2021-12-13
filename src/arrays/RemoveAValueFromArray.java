package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAValueFromArray {
	
	public static void func(int[] a, int val) {
		
		int count = 0;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]!=val) {
				
				count++;
				
			}
			else {
				
				a[i] = Integer.MIN_VALUE; 
				
			}
		}
		
		int[] resA = new int[count];
		int resC = 0;
		
		for(int i=0;i<a.length;i++) {
					
			if (a[i] != Integer.MIN_VALUE) {
				resA[resC] = a[i];
				resC++;
			}
		}
		
		System.out.println(Arrays.toString(resA));
		
	}
	
	public static void funcAnother(int[] a, int element) {
		
		List<Integer> al = new ArrayList<>();
		
		for(int i =0;i<a.length;i++) {

			if(a[i]!= element) {

				al.add(a[i]);
			
			}
			
		}
		
		System.out.println(al);
		
		//then copy this value to an array.
		
	}
	
	

	public static void main(String[] args) {

		int[] a = {41,32,53,14,65,26,87,68,79,40};
		
		//int[] a = {41,32,53,14,65,26,87,68,79,40};
		
		//func(a, 65);
		
		
		funcAnother(a, 65);
	}

}
