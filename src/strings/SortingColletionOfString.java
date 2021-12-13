package strings;

import java.util.Set;
import java.util.TreeSet;

public class SortingColletionOfString {
	
	public static void func() {

		Set<String> st = new TreeSet<>();
		
		st.add("c");
		st.add("a");
		st.add("b");
		
		String res = "";
		System.out.println(st);
		
		for(String str: st) {
			
			res += str;
		}
		
		System.out.println(res);
	}
	
	

	public static void main(String[] args) {
		
		func();

	}

}
