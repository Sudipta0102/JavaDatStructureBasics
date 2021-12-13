package DynamicProg.memoization;

import java.util.HashMap;


//problem is: Given an array and a target sum, find out target sum 
//can be achieved by those elements in the array.

public class CanSumMemoization {

	//Without memoization
	static boolean canSum(int[] a, int targetSum) {		
		if(targetSum==0) 
			return true;
		if(targetSum<0) 
			return false;
		
		for(int i:a) {
			int remainder = targetSum - i;
			if(canSum(a, remainder)==true) {
				return true;
			}
		}		
		return false;
	}

	//Memoization	
	static boolean canSumMemo(int[] a, int targetSum, HashMap<Integer, Boolean> hm) {
		if(hm.containsKey(targetSum)) 
			return hm.get(targetSum);
		if(targetSum==0)
			return true;
		if(targetSum<0) 
			return false;
		
		for(int i:a) {
			int remainder = targetSum - i;
			if(canSumMemo(a, remainder,hm)==true) {
				hm.put(targetSum, true);
				return true;
			}			
		}
		
		hm.put(targetSum, false);
		return false;		
	}
	

			
	public static void main(String[] args) {
		
		int[] a = {7,14};
		//int targetSum = 37444;
		//37444 is the limit with which it's working
		//but without memoization it'll never work.
		int ts = 35392;
		HashMap<Integer, Boolean> hm = new HashMap<>();
		
		//boolean b = canSum(a, targetSum);
		//System.out.println(b);
		
		boolean bb = canSumMemo(a, ts, hm);
		System.out.println(bb);	
	}
	
}
