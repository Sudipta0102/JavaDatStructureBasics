package backtosquaretwobasic;

public class CharTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Character to String conversion 
		//Method 1:
		char z = 'a';
		String d = Character.toString(z);
		System.out.println(d);
		
		//Method 2:
		char y = 'b';
		String e = String.valueOf(y);
		System.out.println(e);
		
		//-------------------------------		
		
		//Character to int
		char i = '1';
		int f = Character.getNumericValue(i);
		System.out.println(f);
				
				
				

	}

}
