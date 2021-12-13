package twoDArrayBasics;

import java.util.Arrays;

public class ForEach {
	public static void main(String[] args) {
		int[][] a = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		for(int[] num:a) {
			
			System.out.println(Arrays.toString(num));
			
		}
		
	}
}
