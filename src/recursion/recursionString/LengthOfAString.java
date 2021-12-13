package recursion.recursionString;

public class LengthOfAString {

	static int func(String s, int end) {
		
		int len=0;
		if(end<0) {
			
			return 0;
			
		}
		else {
			
			len++;
			return func(s, end-1)+len;
			
		}
			
	}
	
	static int funcAnother(String s) {
		
		if(s.equals("")) {
			
			return 0;
		}
		else {
			
			return funcAnother(s.substring(1))+1;
		}
		
		
	}
	

	
	public static void main(String[] args) {
		
		System.out.println(funcAnother("as"));
		
		String s = "asd";
		
		Character.isUpperCase(s.charAt(0));
		

	}

}
