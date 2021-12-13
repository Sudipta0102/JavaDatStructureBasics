package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexRemoveLeadingZeros {
	
	public static void func(String str) {
		
		/*
		 * Pattern p = Pattern.compile("^(0+)");
		 * 
		 * Matcher m = p.matcher(str);
		 * 
		 * if(m.matches()) {
		 * 
		 * str = str.
		 * 
		 * }
		 */
		
		str = str.replaceAll("^(0+)", "");
		
		System.out.println(str);
		
	}
	
	public static void funcAnother(String str) {
		
		int n = str.length();
		String res = "";
		
		for(int i=0;i<n;i++) {
			
			if(str.charAt(i)=='0') {
				
				res = str.substring(i+1, n);
			}
			else if(str.charAt(i) !='0') {
				
				break;
			}		
			
		}
		
		System.out.println(res);	
	}
	
	//Also can be done by StringBuilder.replace() method

	public static void main(String[] args) {

		func("00000102305");
		
		funcAnother("00000102305");
		
	}

}
