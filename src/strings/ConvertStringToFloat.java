package strings;

public class ConvertStringToFloat {
	
	public static void func(String str) {
		
		System.out.println(Float.valueOf(str));
		
	}
	

	public static void main(String[] args) {

		func("1.456f");
		
		func("1.456d");

		//func("1.456ddsf");//numberFormatException

	}

}
