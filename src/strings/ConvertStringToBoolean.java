package strings;

public class ConvertStringToBoolean {

	public static void func(String str) {
		
		
		boolean b = Boolean.valueOf(str);
		
		
		System.out.println(b);
	}
	
	public static void main(String[] args) {

		func("true");
		
		func("false");
		
		func("true1");
		
		func("truetrue");
		

	}

}
