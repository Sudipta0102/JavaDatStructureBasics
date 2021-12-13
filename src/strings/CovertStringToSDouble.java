package strings;

public class CovertStringToSDouble {
	
	//using Double.valueOf
	public static void func(String str) {
		
		Double d = Double.valueOf(str);
		
		System.out.println(d);
	}
	
	// using Double.parseDouble
	public static void funcSecond(String str) {

		Double d = Double.parseDouble(str);

		System.out.println(d);
	}

	// using Double.parseDouble
	public static void funclast(String str) {

		Double d = new Double(str);//that's deprecated

		System.out.println(d);
	}
	
	public static void main(String[] args) {
		
		String str1 = "1.3d";
		
		String str2 = "1.3";
		
		String str3 = "1";
		
		String str4 = "d1.3";
		
		func(str1);
		
		func(str2);
		
		func(str3);
		
		//func(str4);//NumberFormatException
		
		System.out.println("-----");
		
		funcSecond(str1);
		
		funcSecond(str2);
		
		funcSecond(str3);
		
		//funcSecond(str4);//NumberFormatException

		System.out.println("-----");
		
		//funclast(str1);
	}

}
