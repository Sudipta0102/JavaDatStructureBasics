package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCheckStringContainsOnlyWhiteSpaces {

	public static void func(String str) {
		
		Pattern pattern = Pattern.compile("\\S");
		
		Matcher match = pattern.matcher(str);
		
		int count = 0;
		
		while(match.find()) {
			
			count++;
				
		}
			
		
		
		if(count>0) {
			
			System.out.println("contains other than white space");
		}
		else {
			
			System.out.println("contains only white space");
		}
		
	}
	
	public static void funcAnother(String str) {
		
		if(str.trim().isEmpty()) {
			
			System.out.println("contains only white space");
			
		}
		else {
			System.out.println("contains other than white space");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
			func("            ");
			
			func("            123         ");

			
			System.out.println("__________________");
			
			funcAnother("            ");
			
			funcAnother("            123         ");

			
	}

}
