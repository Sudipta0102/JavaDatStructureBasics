package arrays;

import java.util.Arrays;

public class SortByColumnTwoDArray {

	public static void func(int[][] arr) {
		
		int rLen = arr.length;
		int cLen = arr[0].length;
		
		for(int i=0;i<cLen;i++) {
			for(int j=0;j<rLen-1;j++) {
				for(int k = j+1;k<rLen;k++) {
					
					if(arr[k][i]<arr[j][i]) {
						
						int temp = arr[k][i];
						arr[k][i] = arr[j][i];
						arr[j][i] = temp;
						
					}
					
				}
				
				
			}
			
		}
		
		System.out.println(Arrays.deepToString(arr));
		
	}
	
	
	
	public static void main(String[] args) {

		int matrix[][] = { { 39, 27, 11, 42 },
                		   { 10, 93, 91, 90 },
                		   { 54, 78, 56, 89 },
                		   { 34, 44, 10, 35 },
                		   { 24, 64, 20, 65 } };
		
		System.out.println(matrix.length);//row number
		System.out.println(matrix[0].length);// column number
		System.out.println(Arrays.deepToString(matrix));
		
		func(matrix);
		
		/* o/p:
		 * [10, 27, 10, 35], 
		 * [24, 44, 11, 42], 
		 * [34, 64, 20, 65], 
		 * [39, 78, 56, 89], 
		 * [54, 93, 91, 90]
		 */
	}

}
