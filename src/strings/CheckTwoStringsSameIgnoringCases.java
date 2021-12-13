package strings;

public class CheckTwoStringsSameIgnoringCases {
	
	public static void func(String str1, String str2) {
		
		if(str1.toLowerCase().equals(str2.toLowerCase())) {
			
			System.out.println("same string");
		}
		
	}

	public static void main(String[] args) {


		func("aB", "AB");

	}

}
