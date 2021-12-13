package strings;

public class RegexRemoveWhiteSpacesUsing {

	public static void func(String str) {
		
		str = str.replaceAll("\\s", "");
		
		System.out.println(str);
		
	}
	
	public static void main(String[] args) {
		
		String str = "I Am You";
		
		func(str);
	}

}
