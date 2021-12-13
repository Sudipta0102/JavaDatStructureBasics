package strings;

public class ChaeckStringIsValidNumber {
	
	public static void func(String str) {
		
		try {
		
			
				Integer.parseInt(str);
				System.out.println("Valid integer");	
			
			
		}
		catch(NumberFormatException e) {
			
			System.out.println("Not a number");
			
		}
		
	}

	public static void main(String[] args) {
		
		func("1");

	}

}
