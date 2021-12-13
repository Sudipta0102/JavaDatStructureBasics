package twoDArrayBasics;

import java.util.Arrays;
import java.util.Scanner;

public class TakingInput {

	
	
	public static void main(String[] args) {
		
		int[][] a = new int[3][2];
		
		Scanner s = new Scanner(System.in);
		
		//taking input
		for(int row=0;row<a.length;row++) {
			for(int col=0;col<a[row].length;col++) {
				a[row][col] = s.nextInt();				
			}
		}
		
		//taking output
		for(int row=0;row<a.length;row++) {
			for(int col=0;col<a[row].length;col++) {
				System.out.print(a[row][col]+" ");				
			}
			System.out.println();
		}
		
		
		System.out.println(Arrays.deepToString(a));
		
		
		
	}
	
}
