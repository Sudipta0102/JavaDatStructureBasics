package recursion;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesFromAString {

	//with extra space
	static String funcIterative(String s) {
		
		int n = s.length();	
		HashSet<Character> hs = new HashSet<Character>();
		String res = "";		
		for(int i=0;i<n;i++) {		
			if(hs.add(s.charAt(i))) {			
				res+=s.charAt(i);
			}
			
		}
		/*//this also works (for each loop)
		String res1 = "";
		for(char c:hs) {
			res1+=c;
		}
		System.out.println(res1);
		*/
		return res;		
	}
	
	static String removeDups(String s, HashSet<Character> hs) {
		
		if(s.isEmpty()) {
			return "";
		}
		
		if(hs.add(s.charAt(0))) {
			return s.charAt(0) + removeDups(s.substring(1), hs);
		}
		
		return removeDups(s.substring(1), hs);
	}
	
	static String removeDupsAgain(String s, boolean[] bArr) {
		
		if(s.isEmpty()) {
			return "";		
		}
		
		char curChar = s.charAt(0);		
		if(bArr[curChar - 'a']==true) {
			return removeDupsAgain(s.substring(1), bArr);
		}else {
			bArr[curChar - 'a']=true;
			return s.charAt(0)+removeDupsAgain(s.substring(1), bArr);			
		}
	}
	
	public static void main(String[] args) {
		
		String s = "azaxaxaabbcccfabc";
		System.out.println(funcIterative(s));
		HashSet<Character> hs = new HashSet<>();
		System.out.println(removeDups(s, hs));
		
		boolean[] bArr = new boolean[26];		
		System.out.println(Arrays.toString(bArr));
		System.out.println(removeDupsAgain(s, bArr));
		
	}
}
