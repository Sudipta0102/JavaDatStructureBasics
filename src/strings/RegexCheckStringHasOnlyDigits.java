package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCheckStringHasOnlyDigits {

	//this is using regex
	public static void func(String str) {
		
		Pattern pattern = Pattern.compile("\\D");
		
		Matcher match = pattern.matcher(str);
		
		boolean found = false;
		
		while(match.find()) {
			
			System.out.println("not only digits");
			found = true;
			break;
		}
		
		if(!found) {
			
			System.out.println("Only digits");
		}
		
		
		
	}
	
	public static void funcAnother(String str) {
		
	
		int n = str.length();
		
		for(int i=0;i<n;i++) {
			
			if(!Character.isDigit(str.charAt(i))) {
				
				System.out.println("contains other than digits");
				break;
			}
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		//func("123421213");
		
		func("wqe213dfs345%&^");
		
		funcAnother("wqe213dfs345%&");

	}

}
