package recursion.PracticeConfidenceGain;


public class CheckPalindrome {

	static void funcAnother(String s, int start, int end) {
		
		
		if(start>end) {
			
			return ;
			
		}
		
		if(s.charAt(start)==s.charAt(end)) {
			
			funcAnother(s, start+1, end-1);
			
		}
		
		else {
			
			System.out.println("Not palindrome");
			
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {

		String s = "nitin";
		
		System.out.println(func(s, 0, s.length()-1));

	}

}
