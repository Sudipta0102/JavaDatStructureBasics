package strings;

public class ConvertShortToString {

	public static void func(short s) {
		
		String res = String.valueOf(s);
		
		System.out.println(res);
	}
	
	
	public static void main(String[] args) {
		
		//for some reason, typecasting is needed when passing short arguments
		func((short)-12);
		

	}

}
