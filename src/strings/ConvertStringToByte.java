package strings;

public class ConvertStringToByte {

	public static void func(String str) {
		
		System.out.println(Byte.valueOf(str));
		
	}
	
	public static void main(String[] args) {

		func("12");
		
		func("130");
		
		func("dd");
		
		func("12b");

	}

}
