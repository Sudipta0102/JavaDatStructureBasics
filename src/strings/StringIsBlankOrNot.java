package strings;

public class StringIsBlankOrNot {

	public static boolean func(String str) {
		
		if(str.isBlank()) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {

		System.out.println(func(""));//true
		System.out.println(func("   "));//true (with isEmpty it will be false)
		System.out.println(func(null));//null pointer exception

	}

}
