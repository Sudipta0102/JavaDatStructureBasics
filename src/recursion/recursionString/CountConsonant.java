package recursion.recursionString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountConsonant {

	//iterative
	public static void func(String s) {
		
		int countC = 0;
		
		for(int i=0;i<s.length();i++) {
			
			char ch = s.toUpperCase().charAt(i);
			
			if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
				
				continue;
			}
			else {
				
				countC++;
				
			}
			
		}
		
		System.out.println(countC);
		
	}
	
	//regex
	public static void funcAnother(String s) {
		
		int n = s.length();
		
		int countV = 0;
		int countC = 0;
		
		Pattern p = Pattern.compile("[aeiou]");
		
		Matcher m = p.matcher(s.toLowerCase());
		
		for(int i=0;i<n;i++) {
			
		
			if(m.find()) {
			
				countV++;
			
			}
			else {
				
				countC++;
				
			}
		
		}
		
		System.out.println(countV);
		System.out.println(countC);
	}

	//recursive
	public static int funcRec(String s, int end) {
		
		//int c=0;
		if(end<0) {
			
			return 0;
			
		}
		char ch = s.toLowerCase().charAt(end);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			
			return funcRec(s, end-1);
			
		}
		else {
			//c++;
			return funcRec(s, end-1)+1;
		}
		
		//return funcRec(s, end-1);
		
	}
	
	
	public static void main(String[] args) {

		//funcAnother("aeiouAEIOUsd");
		
		System.out.println(funcRec("dfgsd", 4));

	}

}
