package strings;

public class StringIsEmptyOrNot {
	
	public static boolean func(String str) {
		
		if(str.isEmpty()) {
			
			return true;
		}
		else {
			
			return false;
		}
		
	}

	public static void main(String[] args) {
		
		System.out.println(func(""));//true
		
		System.out.println(func("  "));//false
		
		System.out.println(func(null));// null pointer exception

	}

}
