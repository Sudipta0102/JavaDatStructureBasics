package DynamicProg.memoization;

import java.util.Arrays;
import java.util.HashMap;

//time and space are same as canConstruct

public class CountConstructMemoization {

	static int countConstruct(String[] sArr, String target) {
		 
		if(target.equals("")) {					
			return 1;			
		}
		
		int count = 0;
		
		for(String s: sArr) {			
			if(target.startsWith(s)==true) {
				String suffix = target.substring(s.length());
				int temp = countConstruct(sArr, suffix); 			
				count+=temp;
					//return count;		
			}
			
		}	
		return count;
	}
	
	static int countConstructMemo(String[] sArr, String target, HashMap<String, Integer> memo) {
		 
		if(memo.containsKey(target)) {
			return memo.get(target);
		}
		
		if(target.equals("")) {	
			memo.put(target, 1);
			return 1;			
		}
		
		int count = 0;
		
		for(String s: sArr) {			
			if(target.startsWith(s)==true) {
				String suffix = target.substring(s.length());
				int temp = countConstructMemo(sArr, suffix, memo);
				
				count+=temp;						
			}
			
		}	
		
		memo.put(target, 0);
		return count;
	}
	
	public static void main(String[] args) {
		
		
		HashMap<String, Integer> hm = new HashMap<>(); 
		
		//String sA[]  = {"purp", "p", "ur", "le", "purpl"};
		//String target = "purple";		
		
		//String sA[]  = {"abc", "ab", "cd","def", "ef", "cdef"};
		//String target = "abcdef";
		
		String sA[]  = {"abc", "c", "bc","a", "ab"};
		String target = "abc";
		
		/*String[] sA = {
				"e",
				"ee",
				"eee",
				"eeee",
				"eeeee",
				"eeeeee"			
		};
		  
		*/
		//String target = "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef";
		
		
		
		System.out.println(Arrays.toString(sA));
		int c = countConstruct(sA, target);
		//int c = countConstructMemo(sA, target, hm);
		System.out.println(c);
		
		
		
	}
	
}
