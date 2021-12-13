package strings;

public class Palindrome {

	public static void func(String s) {
		
		int n = s.length();
		int count = 0;
		for(int i=0;i<n/2;i++) {
			if(s.charAt(i)!=s.charAt(n-i-1)) {
				System.out.println("not palindrome");
			}
			else {
				count++;
			}			
		}
		
		if (count == n/2) {
			System.out.println("palindrome");
		}
		
		
	}
	
	public static boolean func1(String s) {
		
		int n = s.length();
		
		for(int i=0;i<n/2;i++) {
			
			if(s.charAt(i)!=s.charAt(n-i-1)) {
				
				return false;
				
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {

		func("malayalam");
		
		System.out.println(func1("malayalam"));
	}

}
