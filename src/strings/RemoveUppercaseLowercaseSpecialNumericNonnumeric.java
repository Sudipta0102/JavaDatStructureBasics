package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveUppercaseLowercaseSpecialNumericNonnumeric {

	static void funcUpperCase(String str) {
		
		Pattern p = Pattern.compile("[A-Z]");
		Matcher m = p.matcher(str);

		// 1st way
		// System.out.println(str.replaceAll("[A-Z]", ""));
		
		// 2nd way 
		System.out.println(m.replaceAll(""));
	}
	
	static boolean findSpecialChar(String str) {
		
		Pattern p = Pattern.compile("[^a-zA-Z0-9]");
		
		Matcher m = p.matcher(str);
		
		return m.find();
	}
	
	static boolean findAnything(String str) {
		
		Pattern p = Pattern.compile("I can't write this regex by myself");
		
		Matcher m = p.matcher(str);
		
		return m.find();
		
	}

	
	
	
	public static void main(String[] args) {
		
		String str = "GFGgfg123$%"; 
		
		funcUpperCase(str);
		
		System.out.println(findSpecialChar(str));
	}
	
}
