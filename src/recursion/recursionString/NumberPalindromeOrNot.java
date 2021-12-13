package recursion.recursionString;

public class NumberPalindromeOrNot {

	static boolean func(int num, int start, int end) {
		
		if(start==end) {
			
			return true;
			
		}
		
		if(String.valueOf(num).charAt(start)!=String.valueOf(num).charAt(end)) {
			
			return false;
		}
		
		if(start<(end+1)) {
			
			return func(num, start+1, end-1);
			
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		int num = 4554;
		
		System.out.println(String.valueOf(456).charAt(1));
		
		
		System.out.println(func(num, 0, String.valueOf(num).length()-1));

	}

}
