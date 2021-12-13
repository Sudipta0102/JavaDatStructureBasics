package recursion;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesInString {

	static void func(String str, int len) {
		
		if(len==str.length()) {
			
			return;
			
		}
		
		StringBuilder sb = new StringBuilder(str);
		
		char ch = str.charAt(len);
		
		int n = str.length()-1;
		
		while(true) {
			
			if(ch==str.charAt(i)) {
				
				sb.deleteCharAt(i);
				
			}
			
		}
		
		str = sb.toString();
		
		func(str, len+1);		
	}
	
	
	public static void main(String[] args) {
		
		String str = "bgfxacxfxxhxx";
		
		func(str, 0);
		
		
	}
	
}
