package twoDArrayBasics;

import java.util.Arrays;

public class FindElement {

	static int[] func(int[][] a, int target) {
		
		for(int row=0;row<a.length;row++) {
			for(int col=0;col<a[row].length;col++) {
				if(a[row][col]==target)
					return new int[]{row, col};
			}
			
		}
		
		return new int[] {-1,-1};
	}
	
	public static void main(String[] args) {
		int[][] a= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int target = 11;
		
		System.out.println(Arrays.toString(func(a, target)));
	}
}
