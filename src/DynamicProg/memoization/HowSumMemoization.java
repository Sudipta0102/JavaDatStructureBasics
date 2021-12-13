package DynamicProg.memoization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class HowSumMemoization {

	static ArrayList<Integer> howSum(int[] a, int targetSum, ArrayList<Integer> l) {

		if (targetSum == 0) {
			return l;
		}
		if (targetSum < 0)
			return null;

		for (int i : a) {
			int rem = targetSum - i;
			if (howSum(a, rem, l) != null) {
				l.add(i);
				return l;
			}
		}
		return null;
	}

	static ArrayList<Integer> howSumMemo(int[] a, int targetSum, ArrayList<Integer> l, HashMap<Integer, ArrayList<Integer>> memo) {

		if(memo.containsKey(targetSum)) {				
			return memo.get(targetSum);		
		}
		if (targetSum == 0) {
			return l;
		}
		if (targetSum < 0) {
			return null;
		}	
		for (int i : a) {
			int rem = targetSum - i;
			
			if (howSumMemo(a, rem, l, memo) != null) {	
				l.add(i);
				memo.put(rem, l);
				return memo.get(rem);
				//return l 
			}
		}
		
		memo.put(targetSum, null);
		return memo.get(targetSum);
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
		result = howSum(a, targetSum, l);
		System.out.println(result);
		
		//result = howSumMemo(a, targetSum, result, hm);
		
		//System.out.println(result);
		
		//System.out.println(result.size());
	}
}
