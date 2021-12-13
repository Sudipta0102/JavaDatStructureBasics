package recursion;

public class SkipAStringInAString {

	static String func(String s, String StringToSkip) {

		if (s.isEmpty()) {
			return "";
		}

		if (s.toLowerCase().startsWith(StringToSkip)) {
			return  func(s.substring(StringToSkip.length()), StringToSkip);
		} else {
			return s.charAt(0)+func(s.substring(1), StringToSkip);
		}

	}

	//skip "app" when its not "apple"
	static String funcAnother(String s) {
		
		if(s.isEmpty()) {
			return "";
		}
		
		if(s.toLowerCase().startsWith("app") && !s.toLowerCase().startsWith("apple")) {
			
			return funcAnother(s.substring(3));
		}
		else {
			
			return s.charAt(0)+funcAnother(s.substring(1));
		}
		
		
	}
	
	
	public static void main(String[] args) {

		System.out.println(func("bcccadapple Apple sccddaappleef app", "apple"));

		System.out.println(func("Applepie", "apple"));
		
		System.out.println(funcAnother("ApplePieApp"));
	}

}
