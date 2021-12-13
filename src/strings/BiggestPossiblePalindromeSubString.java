package strings;

public class BiggestPossiblePalindromeSubString {

	public static void funcBiggest(String str) {
		
		int n = str.length();
		int subStrLen1 = 0;
		int subStrLen2 = 0;
		String tempString = "";
		String res="";
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<=n;j++) {
				tempString = str.substring(i, j);
				subStrLen1 = tempString.length();
				if(checkPalindrome(tempString) && subStrLen1>subStrLen2) {
					
					subStrLen2 = subStrLen1;
					res = tempString;
				}
				
			}
		}
		
		System.out.println("Biggest: "+ res);
	}
	
	public static boolean checkPalindrome(String str) {
		
		int n = str.length();
		
		for(int i=0;i<n/2;i++) {
			
			if(str.charAt(i)!=str.charAt(n-1-i)) {
				
				return false;
			}
			
		}
		
		
		return true;
	}
	
	
	public static void main(String[] args) {
		

		funcBiggest("abbc");
	}

}
