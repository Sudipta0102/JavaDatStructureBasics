package strings;

public class PrintAllPalindromicSubSstring {

	static void func(String s) {
		
		int n = s.length();
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<=n;j++) {
				String sub = s.substring(i, j);
				if(sub.length()>1 && isPalimdrome(sub)) {
					System.out.println(sub);
				}				
			}
		}
		
	}
	
	static boolean isPalimdrome(String str) {
		
		int n = str.length();
		
		for(int i=0;i<=str.length()/2;i++) {
			
			if(str.charAt(i)!=str.charAt(n-i-1)) {
				return false;
			}
			
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		
		String s1 = "TENET";
		
		func(s1);
		
		System.out.println(isPalimdrome(s1));
	}
	
}
