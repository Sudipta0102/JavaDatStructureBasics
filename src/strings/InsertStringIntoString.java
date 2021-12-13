package strings;

public class InsertStringIntoString {
	
	public static String func(String str1, String str2, int idx) {
		
		String res = "";
		
		if(idx>str1.length()) {
			return str1;
		}
		
		
		for(int i=0;i<str1.length();i++) {
			
			if(i==idx) {
				
				res = res + str2;
				
			}
			
			res = res + str1.charAt(i);
					
		}
		
		return res;
	}

	public static void main(String[] args) {

			System.out.println(func("IYou","Am",1));
		

	}

}
