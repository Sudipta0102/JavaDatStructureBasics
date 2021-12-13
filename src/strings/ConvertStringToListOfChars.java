package strings;

import java.util.ArrayList;
import java.util.List;

public class ConvertStringToListOfChars {
	
	//This is what i'd do
	public static void func(String str) {
		
		List<Character> lc = new ArrayList<>();
		
		for(int i=0;i<str.length();i++) {
			
			lc.add(str.charAt(i));
			
		}
		
		System.out.println(lc);
		
	}
	
	

	public static void main(String[] args) {

		func("iamyou");

	}

}
