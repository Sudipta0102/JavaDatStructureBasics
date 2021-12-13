package arrays;

import java.util.Arrays;

public class toDArrSize {
	
	
	public static void main(String[] args) {
		
		int[][] toDarr = new int[2][4];
		
		toDarr[0][0] = 15;

		toDarr[0][1] = 10;

		toDarr[0][2] = 9;
		
		toDarr[0][3] = 9;
		
		
		
		toDarr[1][0] = 37;

		toDarr[1][1] = 8;

		toDarr[1][2] = 2;
		
		
		System.out.println(Arrays.deepToString(toDarr));
		
		
		System.out.println(toDarr.length);
		
	}

}
