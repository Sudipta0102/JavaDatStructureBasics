package strings;

public class PalindromeSubString {
	
	public static boolean checkPalindrome(String s) {
		
		int n = s.length();
		
		for(int i=0;i<n/2;i++) {
			
			if(s.charAt(i)!=s.charAt(n-i-1)) {
				
				return false;
				
			}
		}
		
		return true;
	}
	
	public static void func1(String s) {
		
		int n = s.length();
		int count = 0;
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<=n;j++) {
				if(checkPalindrome(s.substring(i, j)) && s.substring(i, j).length()!=1) {
					
					System.out.println(s.substring(i, j));
					count++;
					
				}
				
			}
		}
		System.out.println("the nos of palindrome substring: "+count);
	}

	public static void main(String[] args) {


		//System.out.println(checkPalindrome("aba"));
		
		func1("abab");

	}

}
