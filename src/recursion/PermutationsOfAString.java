package recursion;

import java.util.ArrayList;

public class PermutationsOfAString {

	static void func(String s, String result) {
		
		if(s.isEmpty()) {
			System.out.println(result);
			return;
		}
		
		char curChar = s.charAt(0);	
		for(int i=0;i<=result.length();i++) {			
			//func(s.substring(1), result);
			String first = result.substring(0,i);
			String second = result.substring(i,result.length());
			func(s.substring(1), first+curChar+second);			
		}	
	}
	
	static ArrayList<String> func1(String s, String result, ArrayList<String> r){
		
		if(s.isEmpty()) {
			r.add(result);
			return r;
		}
		char curChar = s.charAt(0);
		for(int i=0;i<=result.length();i++) {	
			r = func1(s.substring(1), result.substring(0,i)+curChar+
					result.substring(i,result.length()), r);
		}
		return r;
	}
	
	static ArrayList<String> func2(String s, String result){
		
		ArrayList<String> r = new ArrayList<String>();
		if(s.isEmpty()) {
			r.add(result);
			return r;
		}
		char curChar = s.charAt(0);
		for(int i=0;i<=result.length();i++) {	
			r = func1(s.substring(1), result.substring(0,i)+curChar+
					result.substring(i,result.length()), r);
		}
		return r;
	}
	
	public static void main(String[] args) {
		
		String s = "abc";
		ArrayList<String> l = new ArrayList<>();
		System.out.println(func2(s, ""));
	}
}
