package strings;

public class FindAllPalindromicSubstring {
	
	public static boolean isPalindrome(String str) {
		
		int n = str.length();
		
		for(int i=0;i<n/2;i++) {
			
			if(str.charAt(i)!=str.charAt(n-1-i)) {
				
				return false;
			}
		}
		
		return true;
	}
	
	public static void func(String str) {
		
		int n = str.length();
		String tempStr;
		
		for(int i=0;i<n-1;i++) {
			
			for(int j=i+1;j<n;j++) {
				
				tempStr =  str.substring(i, j);
				
				if(isPalindrome(tempStr) && tempStr.length()>1) {
					
					System.out.println(tempStr + " is palindrome");
					
				}
			}
			
			
		}
		
	}

	public static void main(String[] args) {

		//System.out.println(isPalindrome("abab"));
		
		func("dfaabajlk");
	}

}
