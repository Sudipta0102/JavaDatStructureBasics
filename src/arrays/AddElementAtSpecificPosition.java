package arrays;

import java.util.Arrays;

public class AddElementAtSpecificPosition {
	
	public static void func(int[] a, int idx, int value) {
		
		int n = a.length;
		int arrCounter = 0;
		
		int[] tempArr = new int[n+1];
		
		for(int i=0;i<tempArr.length;i++) {
			
			if(i==idx-1) {
				
				tempArr[i] = value;
				
			}
			else {
				
				tempArr[i] = a[arrCounter];
				arrCounter++;
			}
			
		}
		System.out.println(Arrays.toString(tempArr));
	}

	public static void main(String[] args) {

		int[] a = {1,2,4};
		
		func(a, 3, 3);

	}

}
