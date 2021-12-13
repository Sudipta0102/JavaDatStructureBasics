package strings;

public class CheckStringRotation {

	public static void func(String  s1, String s2) {
		
		String str = s1+s1;
		
		System.out.println(str);
		
		int flag =0;
		
		for(int i=0;i<str.length()-1;i++) {
			for(int j=i+1;j<str.length();j++) {
				
				if(str.substring(i, j).equals(s2)) {
					
					flag = 1;
					System.out.println("It's rotated string and the string is:" 
														+ str.subSequence(i, j));
					break;
				}
			}
			
		}
		
		if(flag==0) {
			
			System.out.println("it's not rotated string");
		}
	}
	
	//If the length must have to be same of s1 and s2
	public static void funcAnother(String s1, String s2) {
		
		if(s1.length() == s2.length() && (s1 + s1).contains(s2)) {
			
			System.out.println("It's a rotated string");
		}
		
		
	}
	
	public static void main(String[] args) {

		String s1 = "ABCD";
		
		String s2 = "DABC";
		
		func(s1, s2);
		
		
	}

}
