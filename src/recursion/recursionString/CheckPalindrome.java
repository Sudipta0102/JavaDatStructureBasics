package recursion.recursionString;

public class CheckPalindrome {
	
	static boolean func(String s, int start, int end) {
		
		int n = s.length();
		if(start==end) {
			
			return true;
			
		}
		
		if(s.charAt(start)!=s.charAt(end)) {
			
			return false;
		}
		
		if(start<(end+1) && start!=end) {
			
			return func(s, start+1,end-1);
			
		}
		
		return true;
		
	}
	
	

	public static void main(String[] args) {
		
		System.out.println(func("nitin", 0, 4));

	}

}
