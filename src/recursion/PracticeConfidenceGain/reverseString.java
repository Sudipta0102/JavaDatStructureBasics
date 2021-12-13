package recursion.PracticeConfidenceGain;


public class reverseString {

	static String func(String s) {
		
		if(s.length()==0) {
			
			return "";
			
		}
		
		return func(s.substring(1, s.length())) + s.charAt(0);
	}
	
	public static void main(String[] args) {
		
		System.out.println(func("asd"));

	}

}
