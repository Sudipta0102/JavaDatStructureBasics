package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountOccurencesOfGivenCharInString {
	
	public static void func(String str, char ch) {
		
		String sCh = Character.toString(ch); 
		
		Pattern pattern = Pattern.compile(sCh);
		
		Matcher match = pattern.matcher(str);
		
		int count = 0;
		
		while(match.find()) {
			
			count++;
		}
		
		System.out.println(count);
	}
	
	
	public static void main(String[] args) {
		
		func("askad", 'a');
		
	}

}
