package strings;

public class ReversreString {
	
	public static void func(String str) {
		
		int n = str.length();
		String res = "";		
		
		for(int i=n-1;i>=0;i--) {
			
			res += str.charAt(i);
			
		}
		
		System.out.println(res);
	}

	public static void main(String[] args) {

		func("you");

	}

}
