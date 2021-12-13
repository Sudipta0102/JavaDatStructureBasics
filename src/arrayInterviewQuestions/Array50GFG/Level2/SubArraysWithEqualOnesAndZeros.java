package arrayInterviewQuestions.Array50GFG.Level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SubArraysWithEqualOnesAndZeros {

	static void func(int[] a) {
		
		int count = 0;
		int sum = 0;
		
		Map<Integer, Integer> hm = new HashMap<>();
		hm.put(sum, 1); //this is extra...it implies 0 sum 
		//already happened once(0,1)
		
		for(int val: a) {
			
			if(val==0) {
				
				sum+=-1;
				
			}
			if(val==1) {
				
				sum+=1;
			}
			
			if(hm.containsKey(sum)) {
				
				count+=hm.get(sum);
				hm.put(sum, hm.get(sum)+1);
				
			}
			else {
				
				hm.put(sum, 1);
				
			}
			
			//System.out.println(sum);
			//System.out.println(hm);
			
		}
		
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		
		int A[] = {1,0,0,1,0,1,1};
		//1,-1,-1,1,-1,1,1 (replace 0 with -1)
		//0,1,0,-1,0,-1,0,1 (prefix sum array)
		//first 0 is extra which is needed just to consider 
		//the first element in the array
		//1+2+1+3+1=8
		
		System.out.println(Arrays.toString(A));
		
		func(A);
		
	}
	
}
