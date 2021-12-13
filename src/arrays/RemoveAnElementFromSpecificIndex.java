package arrays;

import java.util.Arrays;

public class RemoveAnElementFromSpecificIndex {

	public static void func(int[] a, int idx) {
		
		if(idx>a.length) {
			System.out.println("Invalid index");
			return;
		}
		
		int[] resA = new int[a.length-1];
		int resC = 0;
		
		for(int i=0;i<a.length;i++) {
			
			if(i!=idx) {
				
				resA[resC] = a[i];
				resC++;
				
			}
			
		}
		
		System.out.println(Arrays.toString(resA));
	}
	
	public static void main(String[] args) {

		int[] arr = {41,32,53,14,65,26,87,68,79,40};
		
		
		func(arr, 3);

	}

}
