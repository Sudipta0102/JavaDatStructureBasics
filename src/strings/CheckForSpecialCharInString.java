package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckForSpecialCharInString {

	static boolean func1(String str) {
		int count = 0;
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);	
			if(!Character.isLetter(ch)
					&& !Character.isDigit(ch)
					&& !Character.isWhitespace(ch)) {
				count++;	
				break;
			}			
		}
		
		//System.out.println(count);
		return count!=0;
	}
	
	static boolean func2(String str) {
		
		int count = 0;
		
		Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
		
		Matcher m = p.matcher(str);
		
		return m.find();		
	}
	
	
	public static void main(String[] args) {
		
		 String s1 = "!!Geeks.For.Geeks##";
		 String s2 = "hhjhj2332213 ";
		
		 System.out.println(func1(s1));
		 System.out.println(func1(s2));
		 
		 System.out.println(func2(s1));
		 System.out.println(func2(s2));
	}
	
}
