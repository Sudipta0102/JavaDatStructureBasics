package DynamicProg.tabulation;

import java.util.Arrays;

public class CanSumTabulation {

	static boolean func(int[] a, int targetSum) {
		//taking an array which 1 greater than targetSum
		//because array starts from 0 and targetSum index 
		//will be achieved if we take 8 length array.
		//0 1 2 3 4 5 6 (7)
		//My goal is here is to check for the value at the 
		//last index, if it's true then target sum can be achieved
		//else can't.
		boolean[] b = new boolean[targetSum+1];
		//making first element as true because technically
		//we can achieve 0 sum by not taking any number 
		//from the given array
		b[0] = true;
		System.out.println(Arrays.toString(b));
		
		for(int i=0;i<b.length;i++) {
			if(b[i]==true) {
				for(int num:a) {				
					if(num+i<b.length) {
						b[num+i] = true;
					}			
				}
			}
		}
		System.out.println(Arrays.toString(b));
		
		return b[targetSum];
		
	}
	
	public static void main(String[] args) {
		
		int[] a = {5,3,4};
		int target = 7;
		
		System.out.println(func(a, target));
	}
}
