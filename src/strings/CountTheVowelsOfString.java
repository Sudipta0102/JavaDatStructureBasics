package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountTheVowelsOfString {
	
	public static void func(String str) {
		
		Pattern p = Pattern.compile("(a|e|i|o|u|A|E|I|O|U)");
		
		Matcher m = p.matcher(str);
		
		int count=0;
		
		while(m.find()) {
			
			System.out.println(m.group());
			count++;
					
		}
		
		System.out.println(count);
		
	}
	
	public static void funcIterative(String str) {
		
		
		int n = str.length();
		int count = 0;
		
		for(int i=0;i<n;i++) {
			
			char ch = str.toLowerCase().charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	public static int isVowel(char ch) {
		
		ch = Character.toLowerCase(ch);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			
			return 1;
		}
		
		return 0;
		
	}
	
	public static int funcRecursive(String str, int n) {
		
		if(n==1) {
			
			return isVowel(str.charAt(n-1));
			
			
		}
		
		return funcRecursive(str, n-1) + isVowel(str.charAt(n-1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		func("iamYOu");
		System.out.println("------");
		funcIterative("iamYou");
		System.out.println("------");
		String str = "iamYou";
		System.out.println(funcRecursive(str, str.length()));
		
	}

}
