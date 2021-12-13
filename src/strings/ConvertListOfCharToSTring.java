package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

import spals.shaded.com.google.common.base.Joiner;

public class ConvertListOfCharToSTring {
	
	//1. this is what i'd do 
	public static void func(List<Character> lc) {
		
		String res="";
		
		for(Character ch:lc ) {
			
			res = res + ch;
			
		}
		
		System.out.println(res);
	}
	
	//2. using String builder 
	public static void funcSecond(List<Character> lc) {
		
		StringBuilder sb = new StringBuilder();
		
		for(Character ch: lc) {
			
			sb.append(ch);
			
		}
		
		System.out.println(sb.toString());
	}
	
	//3. using join method of joiner class
	public static void funcThird(List<Character> lc) {
		
		String str = Joiner.on("").join(lc); //It comes from Guava
	
		System.out.println(str);
		
	}
	
	public static void main(String[] args) {

		List<Character> lc = new ArrayList<>(Arrays.asList('I','A','U'));
		

		func(lc);
		
		funcSecond(lc);
		
		funcThird(lc);
	}

}
