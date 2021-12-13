package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElementsFromTheArray {
	
	public static void func(int[] iArr) {
		
		//int[] resArr = new int[iArr.length];
		
		int count = 0;
		
		for(int i=0;i<iArr.length-1;i++) {
			
			if(iArr[i] == Integer.MIN_VALUE) {
				
				continue;
				
			}
			
			for(int j=i+1;j<iArr.length;j++) {

				int x = iArr[i];
				int y = iArr[j];
				
				if(x == y) {
					
					iArr[j] = Integer.MIN_VALUE;
					count++;
				}
				
			}
			
		}
		
		int[] resArr = new int[iArr.length-count];
		int resCount = 0;
		
		for(int i=0;i<iArr.length;i++) {
			
			if(iArr[i]!=Integer.MIN_VALUE) {
				
				resArr[resCount] = iArr[i];
				resCount++;
			}
			
		}
		
		System.out.println(Arrays.toString(resArr));
		
	}
	
	public static void funcAnother(int[] iArr) {
		
		Set<Integer> hs = new HashSet<>();
		
		for(int i=0;i<iArr.length;i++) {
			
			hs.add(iArr[i]);
			
		}
		
		int[] resArr = new int[hs.size()];
		int resCount = 0;
		
		for(Integer i : hs) {
			
			resArr[resCount] = i;  
			resCount++;
			
		}
		
		System.out.println(Arrays.toString(resArr));
		
	}

	public static void main(String[] args) {

		int[] arr = {1,2,2,3,4,5,6,1,9,9};
		
		int[] arr1 = {1,1,1,1,1,1};
		
		//func(arr);

		//func(arr1);
		
		funcAnother(arr1);
		
		func(arr);
	}

}
