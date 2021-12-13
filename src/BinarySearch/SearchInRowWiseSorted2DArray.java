package BinarySearch;

import java.util.Arrays;

public class SearchInRowWiseSorted2DArray {

	static int[] search(int[][] a, int target) {
		
		int r = 0;
		int c = a.length - 1;
		
		while(r<a.length && c>=0) {
			
			if(a[r][c]==target) {
				return new int[] {r,c};
			}
			else if(target<a[r][c]) {
				c--;
			}
			else {
				r++;
			}
			
		}
		
		return new int[] {-1,-1};
		
	}
	
	public static void main(String[] args) {
		
		//this is completely sorted matrix
		//because all elements of previous row are less than the next row. 
		int[][] a = {    
				{1,2,3}, 
				{4,5,6},
				{7,8,9}
			};
		
		//this is row wise sorted matrix and not sorted matrix 
		int[][] b = {
				{10,20,30,40}, 
				{15,25,35,45},
				{28,29,37,49},
				{33,34,38,50}		
			};
		
		System.out.println(Arrays.toString(search(a, 9)));
	}
}
