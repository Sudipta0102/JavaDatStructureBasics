package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexRemoveAllNonAlphabeticalChar {
	
	public static void func(String str) {
		
		//str = str.replaceAll("[^A-Za-z]", "");

		//str = str.replaceAll("\\W+", "");//this doesn't work, digit remains
		
		str = str.replaceAll("[^\\p{IsAlphabetic}]", "");
		System.out.println(str);
		

	}

	public static void main(String[] args) {

		String str = "jhh76678^&%&%^hhkGH";
		
		String str1 = "Hi How are you wrty$%$%^ 2341)(";

		func(str1);
		
		func(str);
		
		
	}

}
