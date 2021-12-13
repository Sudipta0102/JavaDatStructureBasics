package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecialCharCheck {

	public static int func(String s) {
		
		int count = 0;
		
		for(int i=0;i<s.length();i++) {
			
			if(!Character.isAlphabetic(s.charAt(i)) && !Character.isDigit(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))){
				
				count++;
				
			}
			
		}
		
		return count;
	}
	
	
	public static void func1(String s) {
		
		int count = 0;
		
		//creating a regex pattern by creating the object of Pattern class
		Pattern p = Pattern.compile("[^a-z0-9]", Pattern.CASE_INSENSITIVE);
		
		//now creating a matcher for above pattern on our string
		Matcher m = p.matcher(s);
		
		boolean res = m.find();
		
		if(res)
			System.out.println("contains special char");
		else
			System.out.println("spcl char nei :)");
	}
	
	public static void main(String[] args) {
		
		String s = "www@@@##$$  ereeew123##";
		
		System.out.println(func(s));
		
		func1(s);
		

	}

}
