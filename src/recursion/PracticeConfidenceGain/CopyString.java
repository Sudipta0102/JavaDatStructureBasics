package recursion.PracticeConfidenceGain;

public class CopyString {
	
	static String func(String s, int len) {
		
		if(len==0) {
			
			return "";
			
		}
		
		return func(s.substring(0,len-1), len-1)+ s.charAt(len-1);
		
	}

	public static void main(String[] args) {

		String s = func("asd", 3);
		
		System.out.println(s);
		

	}

}
