package strings;

import java.util.Arrays;

public class PrintSmallestAndLargestPalindromeInAString {

	static void func(String s) {
		
		String[] sArr = s.split("\\W");
		
		System.out.println(Arrays.toString(sArr));
		int max_len =0;
		int min_len = 0;
		String max_Str = "";
		String min_str = "";
		
		for(int i=0;i<s.length();i++) {
			
			int current_len = sArr[i].length();
			String str = sArr[i];
			
			if(isPalindrome(sArr[i])) {
				
				if(max_len < current_len) {
					max_Str = sArr[i];
					max_len = current_len;
				}	
				
				if(min_len > current_len) {
					min_str = sArr[i];
					min_len = current_len;
				}
			}			
		}
		
		System.out.println(max_Str);
		System.out.println(min_str);
	}
	
	static boolean isPalindrome(String s) {		
		int n = s.length();		
		for(int i=0;i<=n/2;i++) {			
			if(s.charAt(i) != s.charAt(n-i-1))
				return false;			
		}		
		return true;
	}
	
	public static void main(String[] args) {
		
		String s1 = "wow madam is driving racecar";
		String s2 = "Nitin is a good guy";
		
		func(s1);
		
	}
}
