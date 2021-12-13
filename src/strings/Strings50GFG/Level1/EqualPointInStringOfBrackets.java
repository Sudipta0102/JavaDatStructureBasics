package strings.Strings50GFG.Level1;

import java.util.Stack;

public class EqualPointInStringOfBrackets {
	//"(())))("
	static int func(String s) {
		
		char ch1 = '(';
		char ch2 = ')';
		int count = 0;
		
		Stack<Character> stack = new Stack<>();
		
		int n = s.length();
		
		for(int i =0;i<n;i++) {
			
			if(s.charAt(i)==ch1) {
				
				stack.push(s.charAt(i));
				count++;

			}			
			else if(s.charAt(i)==ch2 && !stack.isEmpty()) {
				
				stack.pop();
				count--;
			}
			else {
				
				count++;
			}
		}
		
		if(count == n) {		
			return count;
		}
		else {
			return (n-count);			
		}
	}
	
	public static void main(String[] args) {
		
		String s = "())))(";
		String s1 = "((";
		
		
		System.out.println(func(s1));
	}

}
