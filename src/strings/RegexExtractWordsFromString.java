package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExtractWordsFromString {
	
	public static void func(String str) {
		
		//Pattern p = Pattern.compile("\\w+");
		Pattern p = Pattern.compile("[a-zA-Z]+");
		Matcher m = p.matcher(str);
		
		while(m.find()) {
			
			System.out.println(m.group());
			
		}
				
		
	}

	public static void main(String[] args) {

		func("I Am You. but, I am also me!!");
		

	}

}
