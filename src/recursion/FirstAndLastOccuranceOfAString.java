package recursion;

public class FirstAndLastOccuranceOfAString {

	static void func(String str, char c, int first) {
		
		if(first==str.length()) {
			
			System.out.println(c + " not present");
			return;
		}
		if(str.charAt(first) == c) {
			
			System.out.println(first +" is the index");
			return;
		}
		
		func(str, c, first+1);
		
	}
	
	
	/*
	 * 
	 * 
	 * 
	 */
	static void func(String str, char c, int first , int last, int len) {
		
		if(len==str.length()) {
			
			if(first!=-1 && last!=-1) {
		
				System.out.println(first + " is the first index");
				System.out.println(last + " is the last index");
				return;
				
			}
			else {
				
				System.out.println(c+" is not present");
				
			}
			
		}
		if(str.charAt(len)==c && first == -1) {
			
			first = len;
			last = len;
					
		}
		else if(str.charAt(len)==c && first != -1) {
			
			last = len;
						
		}
		
		func(str, c, first, last, len+1);
		
		
	}
	
	
	public static void main(String[] args) {
		
		String str = "fhgaaafgaa";
		
		//func(str, 'b', 0);
		func(str, 'a',-1, -1, 0);	
	}	
}
