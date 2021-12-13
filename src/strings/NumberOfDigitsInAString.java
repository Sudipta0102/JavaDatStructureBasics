package strings;

public class NumberOfDigitsInAString {

	public static void func(String str) {
		
		int dCount = 0;
		
		char[] cArr = str.toCharArray();
		
		for(int i=0;i<cArr.length;i++) {
			
			if(Character.isDigit(cArr[i])) {
				
				dCount++;
				
			}
			
		}
		
		System.out.println(dCount);
	}
	
	
	public static void main(String[] args) {
		
		String s = "ab4A5~@a12# 12$rfD";
		
		func(s);
		
		
	}

}
