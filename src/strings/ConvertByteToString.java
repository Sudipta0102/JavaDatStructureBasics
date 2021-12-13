package strings;

public class ConvertByteToString {

	public static void func(Byte b) {
		
		System.out.println(String.valueOf(b));
		
	}
	
	
	public static void main(String[] args) {

		
		//for some reason, typecasting is needed when passing byte arguments
		func((byte)220);
		
		func((byte)22);

	}

}
