package strings;

import java.util.HashMap;
import java.util.Map;

minimun ta hoyni...need to get back


public class BiggestAndSmallestPossiblePalindrome {

	public static void func(String str) {
		
		String[] sArr = str.split("\\W");
		Map<String,Integer> sm = new HashMap<String,Integer>();
		String bStr="";
		String sStr="";
		int bLen=1;
		int sLen=1;
		
		for(int i=0;i<sArr.length;i++) {
			
			if(checkPalindrome(sArr[i])) {
				
				sm.put(sArr[i], sArr[i].length());
				
			}
			
		}
		
		
		for(Map.Entry<String,Integer> entry: sm.entrySet()) {
			
			sLen = entry.getValue();
			
			if(entry.getValue()>bLen) {
				
				bLen = entry.getValue();
				bStr = entry.getKey();
			}
			
		}
		
		System.out.println(bStr);
		
		
		
		
		System.out.println(sStr);
		
		
	}
	
	
	public static boolean checkPalindrome(String str) {
		
		int n = str.length();
		
		for(int i=0;i<n/2;i++) {
			if(str.charAt(i)!=str.charAt(n-1-i)) {
				
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		func("malayalam lala madam racecar lala");
		
		

	}

}
