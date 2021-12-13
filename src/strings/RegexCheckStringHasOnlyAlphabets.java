package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCheckStringHasOnlyAlphabets {
	
	public static void func(String str) {
		
		int n = str.length();
		
		for(int i=0;i<n;i++) {
			
			if(!Character.isAlphabetic(str.charAt(i))) {
				
				System.out.println("first occurence of non alphabetic character is:" + str.charAt(i));
				break;
			}
			
		}
		
	}
	
	public static void funcAnother(String str) {
		
		Pattern pattern = Pattern.compile("[^a-zA-Z]");
		
		Matcher match = pattern.matcher(str);
		
		boolean found = false;
		
		while(match.find()) {
			
			System.out.println(match.group());
			found = true;
			
		}
		
		if(!found) {
			
			System.out.println("there are no non alphabetic characters");
		}
		
		
	}
	

	public static void main(String[] args) {


		func("ghwer1");
		
		System.out.println("__________");
		
		funcAnother("ghwer");

	}

}
