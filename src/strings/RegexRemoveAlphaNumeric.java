package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexRemoveAlphaNumeric {
	
	public static void func(String str) {
		
		String res = str.replaceAll("[0-9a-zA-Z]", "");
		
		System.out.println(res);
		
	}

	public static void main(String[] args) {
		
		func("qw3e$%");

	}

}
