package DynamicProg.memoization;

import java.util.HashMap;

public class CanConstructMemoization {

	//time: O(n^m * m) (i.e. exponential) where m = target.length
	//and n = sArr.length
	//O(m) space
	static boolean canConstruct(String[] sArr, String target) {
		
		if(target.equals("")) {
			return true;
		}
		
		for(String str: sArr) {		
			if(target.startsWith(str)==true) {
				String suffix = target.substring(str.length());
				if(canConstruct(sArr, suffix)==true) {					
					return true;				
				}			
			}		
		}		
		return false;
	}
	
	
	//time: O(n*m^2) i.e. polynomial
	//space: O(m^2) 
	static boolean canConstructMemo(String[] sArr, String target, HashMap<String, Boolean> memo) {
		
		if(memo.containsKey(target)) {			
			return true;
		}
		if(target.equals("")) {
			return true;
		}
		
		for(String str: sArr) {		
			if(target.startsWith(str)==true) {
				String suffix = target.substring(str.length());
				if(canConstructMemo(sArr, suffix, memo)==true) {					
					memo.put(suffix, true);
					return true;				
				}			
			}		
		}
		
		memo.put(target, false);
		return false;
	}
	
	public static void main(String[] args) {
		
		//String[] a = {"abc", "ab", "cd","def", "bcdef"};
		//String target = "abcdef";
		HashMap<String, Boolean> hm = new HashMap<>();
		
		String[] a = {
				"e",
				"ee",
				"eee",
				"eeee",
				"eeeee",
				"eeeeee"			
		};
		String target = "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef";
		
		//boolean b = canConstruct(a, target);
		//System.out.println(b);
		
		boolean b = canConstructMemo(a, target, hm);
		System.out.println(b);
		
	}
}
