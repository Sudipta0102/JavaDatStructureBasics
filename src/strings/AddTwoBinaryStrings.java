package strings;

public class AddTwoBinaryStrings {

	static void func(String s1, String s2) {
		
		//1. check for number format exception
		//2. check for digits other than 0 and 1.
		
		for(int i=0;i<s1.length();i++) {
			char ch = s1.charAt(i);
			
			if(s1.charAt(i) != '0' && s1.charAt(i) != '1' ) {
				System.out.println("s1 is not binary and the sum is: "+s2);
				
				
				break;
			}
		}
		
		for(int i=0;i<s2.length();i++) {
			if(s2.charAt(i) != '0' && s2.charAt(i) != '1' ) {
				System.out.println("s2 is not binary and the sum is: " + s1);
				break;
			}
		}
		
		// is both are binary looking string, then do the actual sum.
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		String s1 = "01011";
		String s2 = "0101gf1";
		
		func(s1, s2);
		
	}
}
