package strings;

public class RegexRemoveLeadingOrTrailingSpaces {
	
	public static void func(String str) {
		
		//str = str.stripLeading().stripTrailing();
		//str  = str.trim();
		str = str.strip();
		
		System.out.println(str);
		
		
	}
	
	public static void funcAnother(String str) {
		
		str = str.replaceAll("^(\\s+)|(\\s+)$", "");
		
		//System.out.println(str);
		
		//str = str.replaceAll("(\\s+)$", "");
		
		System.out.println(str);
	}

	public static void main(String[] args) {

		
		func("    erw ewr    !      ");
		
		System.out.println("-------");
		
		funcAnother("    erw ewr    !      ");
		

	}

}
