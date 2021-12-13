package recursion;

import java.util.ArrayList;

public class AllSubsequencesOfString {
	static void func(String s, String result) {		
		if(s.isEmpty()) {
			System.out.println(result);
			return;
		}
		char curChar = s.charAt(0);
		func(s.substring(1), result+curChar);	
		func(s.substring(1), result);		
	}
	
	static ArrayList<String> func1(String s, String result, ArrayList<String> l) {		
		if(s.isEmpty()) {			
			l.add(result);
			return l;	
		}		
		char curChar = s.charAt(0);		
		l = func1(s.substring(1), result+curChar, l);
		l = func1(s.substring(1), result, l);

		return l;
	}
	
	static ArrayList<String> func2(String s, String result){
		ArrayList<String> l = new ArrayList<>();
		if(s.isEmpty()) {
			l.add(result);
			return l;
		}
		
		char curChar = s.charAt(0);
		ArrayList<String> left = func2(s.substring(1), result+curChar);
		ArrayList<String> right = func2(s.substring(1), result);
		left.addAll(right);
		
		return left;		
	}
	
	public static void main(String[] args) {
		String s = "aab";		
		func(s, "");
		ArrayList<String> result = new ArrayList<>();
		System.out.println(func1(s, "", result));
		System.out.println(func2(s, ""));
	}
	
}
