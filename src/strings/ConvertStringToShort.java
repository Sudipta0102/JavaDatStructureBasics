package strings;

public class ConvertStringToShort {
	
	public static void func(String str) {
		
		System.out.println(Short.valueOf(str));
		
	}

	public static void main(String[] args) {
		
		func("12");
		
		func("100000");//NumberFormat exception
		

	}

}
