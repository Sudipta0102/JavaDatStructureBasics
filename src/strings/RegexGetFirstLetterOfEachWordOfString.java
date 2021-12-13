package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexGetFirstLetterOfEachWordOfString {

	public static void func(String str) {
		
		String[] sArr = str.split("\\s"); // :D, i used regex alright :P
		
		for(int i=0;i<sArr.length;i++) {
			
			System.out.println(sArr[i].charAt(0));
			
		}
		
	}
	
	public static void funcAnother(String str) {
		
		Pattern p = Pattern.compile("\\b[a-zA-Z]"); 
		
		Matcher m = p.matcher(str);
		
		while(m.find()){
			
			System.out.println(m.group());
			
		}
	}
	
	public static void main(String[] args) {
		
		func("I Am You");
		
		System.out.println("--------");

		funcAnother("I Am you");
	}

}
