package strings.Strings50GFG.Level1;

import java.util.HashMap;
import java.util.Map;

public class KAnagarams {

	static boolean func(String s1, String s2, int k) {
		
		/*
		 * 1. for the first string, key value needs to be taken
		 * 2. for second string, for every occurrence of a character, 
		 *	subtract 1 from the value part of s1 map.
		 *   Now, two thing can happen here.
		 *		2a. any character can be more than the value of s1
		 *		2b. one new character can be there in the second string.
		 *	As the length of both strings have to be same, for both cases,
		 *  there must one extra occurrence or a new character in s1. 
		 *  3. So, if the only focus is the positive values of s1 map, that 
		 *  should give the count of number of change one needs to have to
		 *  make it anagram
		 *  	because the number of positive values will refer to the changes 
		 *  in s1 from s2 to make s1 anagram and the number of negative values 
		 *  will refer to the number changes needs to be made in s2. 
		 *   
		 */
		
		Map<Character, Integer> hm = new HashMap<>();
		int n1 = s1.length();
		int n2 = s2.length();
		
		if(n1!=n2) {
			
			return false;
			
		}
		
		if(k>n1) {
			
			return true;
		
		}
		
		for(int i=0;i<n1;i++) {
			
			char ch = s1.charAt(i);
			hm.put(ch, hm.getOrDefault(ch, 0)+1);
			
		}
		
		System.out.println(hm);
		
		for(int i=0;i<n2;i++) {
			
			char ch = s2.charAt(i);
			if(hm.getOrDefault(ch, 0)>0) {
				hm.put(ch, hm.get(ch)-1);			
			}
		}
		
		int count = 0;
		
		for(Character ch: hm.keySet()) {
			
			count+=hm.get(ch);
			
		}
		
		System.out.println(hm);
		
		if(count>k ) {
			
			return false;
		}
		else {
			
			return true;
		}
	}
	
	public static void main(String[] args) {
		
		String s1 = "anagram";
		String s2 = "grammar";
		
		boolean b = func(s1, s2, 2);
		
		System.out.println(b);
	}
	
}
