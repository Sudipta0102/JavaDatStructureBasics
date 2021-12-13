package strings;

import java.util.Stack;

public class ReverseSTringWithStack {
	
	public static void func(String str) {
		
		int n = str.length();
		String res = "";
		
		for(int i=n-1;i>=0;i--) {
			
			res += str.charAt(i);
					
		}
		
		System.out.println(res);
	}
	
	public static void funcMain(String str) {
		
		char[] pushCharArr = new char[str.length()];
		char[] resArr = new char[str.length()];
		String res = "";
		
		//pushing
		for(int i=0;i<pushCharArr.length;i++) {
			
			pushCharArr[i] = str.charAt(i);
			//System.out.println(pushCharArr[i]);
		}
		
		//popping
		for(int i=pushCharArr.length-1,j=0;i>=0;i--,j++) {
			
			resArr[j] = pushCharArr[i];
			//System.out.println(resArr[j]);
			res+=resArr[j];
			
		}
		
		System.out.println(res);
	}
	
	public static String funcStackLib(String str) {
		
		char[] revStr = new char[str.length()];
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0;i<revStr.length;i++) {
			
			stack.push(str.charAt(i));
		}
		
		for(int i=0;i<revStr.length;i++) {
			
			revStr[i] = stack.pop();
			
		}
		
		return new String(revStr);
	}

	public static void main(String[] args) {
		
		func("polo");
		funcMain("polo");
		
		System.out.println(funcStackLib("polo"));

	}

}
