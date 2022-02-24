package strings;

import java.util.Arrays;



public class RemoveWordFromAString {

	public static void func(String str, String word) {
		
		String[] sArr = str.split("\\W");
		String res = "";
		int n = str.length();
		
		System.out.println(Arrays.toString(sArr));
		
		for(int i=0;i<sArr.length;i++) {
			
			String temp = sArr[i];
			
			if(temp.equals(word)) {
				sArr[i] = "";
			}
		}
		
		System.out.println(Arrays.toString(sArr));
		
		for(String s: sArr ) {
			
			if(!s.equals("")) {
				res+= s + " ";
			}
			
		}		
		
		System.out.println(res.substring(0, res.length()-1));
		
	}
	
	static String moveAllUpperCaseToEnd(String s) {
		
		int n = s.length();
		
		String strUpper = "";
		String strElse = "";
		
		for(int i=0;i<n;i++) {
			char ch = s.charAt(i);
			if(Character.isUpperCase(ch)) {
				strUpper += ch;
			}
			else {
				strElse += ch;
			}
		}
	
		//System.out.println(strUpper);
		//System.out.println(strElse);
		
		return strElse+strUpper;
	}
			
			

	public static void main(String[] args) {

		String str = "I Am Am You Amyou youAm Am";
		func(str, "Am");
		
		String s1 = "ghjGHdffDF4567KJmnb ";
		String s2 = "Hello";
		
		System.out.println(moveAllUpperCaseToEnd(s1));
		System.out.println(moveAllUpperCaseToEnd(s2));
		
		
	}

}
