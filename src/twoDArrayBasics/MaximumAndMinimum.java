package twoDArrayBasics;

public class MaximumAndMinimum {

	static void findMaxAndMin(int[][] a) {
		int max = a[0][0];
		int min = a[0][0];
		
		for(int row=0;row<a.length;row++) {
			for(int col=0;col<a[row].length;col++) {
				if(a[row][col]>max) {
					max = a[row][col];
				}
				
				if(a[row][col]<min) {
					min = a[row][col];
				}
			}
		}
		
		System.out.println(max);
		System.out.println(min);
	}
	public static void main(String[] args) {
		int[][] a = {
			{4,2,8},
			{7,9,1},
			{6,3,5}
		};
		
		findMaxAndMin(a);
	}
}
