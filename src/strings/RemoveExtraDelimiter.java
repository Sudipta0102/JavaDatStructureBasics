package strings;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

eta parini korte

public class RemoveExtraDelimiter {
	
	public static void func(String str, Character delim) {
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));	
		System.out.println(str.charAt(4));
		
		StringBuilder sb = new StringBuilder(str);
		
		
	}

	public static void main(String[] args) {

		String str= "i,a,m,y,o,u,";
		
		String str1= "i,a,,m,y,o,u,";
		
		String str2= "i.a.m.y..o.u";

		func(str1,',');
		//func(str1,',');
		//func(str2,'.');
	}

}
