package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 Mobile Number validation criteria:

    The first digit should contain number between 7 to 9.
    The rest 9 digit can contain any number between 0 to 9.
    The mobile number can have 11 digits also by including 0 at the starting.
    The mobile number can be of 12 digits also by including 91 at the starting
 */

public class RegexCheckMobileNumberPattern {
	
	public static boolean func(String str) {
		
		//boolean found = false;
		
		//Pattern p = Pattern.compile("^(0|91)?\\d{9}");
		
		//Matcher m = p.matcher(str);
		
	
		if(Pattern.matches("^(0|91)?(7|8|9)\\d{6}", str)) {
			
			return true;
			
		}
		
		else {
			
			return false;
		}
		
		
		
	}

	public static void main(String[] args) {

		String str = "0567879546";
		
		String str1 = "91798657890";
		
		String str2 = "687768980";
		
		String str3 = "980980908980";
		
		String str5 = "00000000000";
		
		System.out.println(func(str1));
		
		
		
		

	}

}
