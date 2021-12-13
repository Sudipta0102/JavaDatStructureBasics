package strings;

public class RemoveUpperLowerNumericNonnumericSpecial {
	
	public static void removeUpperCase(String str) {
		
		String res = str.toLowerCase();
		
		System.out.println(res);
		
		System.out.println("----------");
	}
	
	public static void removeLowerCase(String str) {
		
		String res = str.toUpperCase();
		
		System.out.println(res);
		
		System.out.println("----------");
	}
	
	public static void removeNumeric(String str) {
		
		String res = str.replaceAll("\\d", "") ;
				
		
	/*
		for(int i=0;i<str.length();i++) {

			if(Character.isDigit(str.charAt(i))) {
				str.replaceFirst("\\d", "");
			}
		
			res+=str.charAt(i);
		}
		
	*/	
		System.out.println(res);
		
		System.out.println("----------");
	}
	
	public static void removeNonNumeric(String str) {
		
		String res = str.replaceAll("\\D", "");
		
		System.out.println(res);
		
		System.out.println("----------");
	}
	
	public static void removeSpecialChar(String str) {
		
		String res = str.replaceAll("[^\\W]", "");
		
		//or
		
		String res1 = str.replaceAll("\\w", "");
		
		//or
		
		String res2 = str.replaceAll("[0-9a-zA-Z]", "");
		
		System.out.println(res);
		
		System.out.println(res1);
		
		System.out.println(res2);
		
		System.out.println("----------");
	}

	public static void main(String[] args) {

		String str = "AbcM123%$1";
		
		removeUpperCase(str);
		
		removeLowerCase(str);

		removeNumeric(str);
		
		removeNonNumeric(str);
		
		removeSpecialChar(str);
	}

}
