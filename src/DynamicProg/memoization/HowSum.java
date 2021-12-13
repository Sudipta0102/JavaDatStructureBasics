package DynamicProg.memoization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class HowSum {

	static ArrayList<Integer> howSum(int[] a, int targetSum) {
		
		if (targetSum == 0) {
			return new ArrayList<>();
		}
		if (targetSum < 0)
			return null;
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		for (int i : a) {
			int rem = targetSum - i;
			ArrayList<Integer> temp = l;
			if (howSum(a, rem) != null) {
			
				//add
				//return l;
			}
			
		}
		return null;
	}

	

	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();

		HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();

		//int[] a = {7,14};
		//int targetSum = 301;

		//int[] a = {9,5,10};
		//int targetSum = 28;
		
		int[] a = {2,3,5,7};
		int targetSum = 8;
		
		
		System.out.println(Arrays.toString(a));
		result = howSum(a, targetSum);
		//result = howSumMemo(a, targetSum, result, hm);
		System.out.println(result);
		
	}
}
