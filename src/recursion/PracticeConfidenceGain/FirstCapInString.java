package recursion.PracticeConfidenceGain;

public class FirstCapInString {

	static void func(String s, int start) {
		
		if(start == s.length()) {
			
			return;
			
		}
		
		if(Character.isUpperCase(s.charAt(start))) {
			
			System.out.println(s.charAt(start));
			return;
			
		}
		
		else {
			
			func(s, start+1);
		}
		
	}
	
	public static void main(String[] args) {


		func("adsd", 0);

	}

}
