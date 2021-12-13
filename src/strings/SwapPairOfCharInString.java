package strings;

public class SwapPairOfCharInString {

	public static void func(String str) {
		
		int n = str.length();
		
		String res= "";
		
		for(int i=0;i<n-1;i=i+2) {
			
			res = res + str.charAt(i+1) + str.charAt(i);
		}
		
		//if the character is of odd numbers, then append the last number to the result string
		if(res.length()<str.length()) {
			
			//res = res + str.charAt(str.length()-1);
			
			res = res + str.substring(str.length()-1);
			
		}
		
		System.out.println(res);
	}
	
	public static String funcNormal(String str) {
		
		char[] cArr = str.toCharArray();
		
		int n = cArr.length;
		
		for(int i=0;i<n-1;i=i+2) {
			
			char temp;
			
			temp = cArr[i];
			cArr[i] = cArr[i+1];
			cArr[i+1] = temp;
			
		}
		
		return new String(cArr);
	}
	
	public static void main(String[] args) {

		func("javac");
		
		func("abcdefg");
		
		String res = funcNormal("java");
		
		System.out.println(res);

	}

}
