package strings;

public class StringIsNullOrNot {
	
	public static boolean func(String str) {
		
		if(str == null) {
			
			return true;
		}
		
		else {
			
			return false;
		}
	}

	public static void main(String[] args) {

		System.out.println(func(null));
		
		System.out.println(func(""));
		

	}

}
