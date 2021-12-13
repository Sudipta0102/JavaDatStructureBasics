package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCheckStrContainsOnlyAlphabets {

	public static void func(String str) {
		
		Pattern p = Pattern.compile("\\W");
		
		Matcher m = p.matcher(str);
		
		boolean found = false;
		
		while(m.find()) {
			
			found = true;
			System.out.println(m.group());
			
		}
		
		if(found==false) {
			
			System.out.println("only alphabets");
		}
	}
	
	
	public static void main(String[] args) {

		String str1="12^%%^&abbsggGHGH";
		
		String str2 = "HGJHGJHGghjghghghj";
		
		func(str1);
		
		func(str2);


	}

}
