package recursion.recursionString;

public class ReverseString {
	
	static String func(String s) {
		
		int n = s.length();
		//String res = "";
		
		if(n==0) {
			
			return "";
			//System.out.print(s.charAt(0));
			//res = res+s.charAt(0);
			
		}
		
		return func(s.substring(1)) + s.charAt(0);
	}

	public static void main(String[] args) {
		
		System.out.println(func("mamo"));

	}

}
