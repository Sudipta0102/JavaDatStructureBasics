package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCheckOnlySpclCharInStr {
	
	public static void func(String str) {
		
		Pattern pattern = Pattern.compile("[0-9a-zA-Z]");
		
		Matcher match = pattern.matcher(str);
		
		if(match.find()) {
			System.out.println("contains other than special character");
		}
		else {
			System.out.println("Only Contains Special Character");
		}
	}
	
	public static void funcAnother(String str) {
		
		int n = str.length();
		
		int count = 0;

		for(int i=0;i<n;i++) {
			
			if(Character.isDigit(str.charAt(i))|| Character.isAlphabetic(i)) {
				
				count++;
				System.out.println("Contains other than special characters");
				
				break;
			}
		}
		
		if(count==0)
		
			System.out.println("Contains only speacial characters");
	}

	public static void main(String[] args) {
		
		String str = "ghhj456546%^$%^$$%^";
		
		String str1 = "%^&%^&%^&%^&@#@#$@#$";
		
		func(str);
		
		System.out.println("----------------");
		
		func(str1);

		System.out.println("----------------");
		
		funcAnother(str);
		
		System.out.println("----------------");
		
		funcAnother(str1);
		
	}

}
