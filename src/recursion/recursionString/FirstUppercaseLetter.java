package recursion.recursionString;

public class FirstUppercaseLetter {

	static char func(String s) {
		
		int n = s.length();
		for(int i=0;i<n;i++) {
			
			if(Character.isUpperCase(s.charAt(i))) {
				
				return s.charAt(i);
						
			}
			
		}
		
		return '\0';
	}
	
	public static char funcRec(String s, int start) {
		
		if(s.charAt(start)=='\0') {
			
			return 0; 
			
		}
		if(Character.isUpperCase(s.charAt(start))) {
			
			return s.charAt(start);
			
		}
		return funcRec(s, start+1);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(funcRec("ertTyL", 0));
		
		
		
	}

}
