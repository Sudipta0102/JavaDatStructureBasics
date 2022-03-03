package strings;

import java.util.Stack;

public class ReverseStringUsingStack {

	static void func(String str) {
		
		Stack<Character> stack = new Stack<Character>();
		int n = str.length();
		String res = "";
		
		// pushing
		for(int i=0;i<n;i++) {
			stack.add(str.charAt(i));
		}
		
		// popping to a res
		for(int i=0;i<n;i++) {
			res += stack.pop();			
		}
		
		System.out.println(res);
		
	}
	
	
	public static void main(String[] args) {
		
		String s = "team";
		
		func(s);
	}
}
