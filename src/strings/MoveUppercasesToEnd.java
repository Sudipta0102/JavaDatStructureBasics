package strings;

public class MoveUppercasesToEnd {
	
	public static void func(String str) {
		
		String upper = "";
		String lower = "";
		
		for(int i=0;i<str.length();i++) {
		
			if(Character.isUpperCase(str.charAt(i))) {
				
				upper = upper + str.charAt(i);
			
			}
			else {
				
				lower = lower + str.charAt(i);
			}
		}

		
		System.out.println(lower+upper);
	}	
	
	//using regex
	public static void funcAnother(String str) {
		
		
		System.out.println(str.replaceAll("[A-Z]", "")+str.replaceAll("[^A-Z]", ""));
		
	}
	
	public static void main(String[] args) {

		func("hgjhgjSDhjDSkjljklKL");
		
		funcAnother("hgjhgjSDhjDSkjljklKL");
		
	}

}
