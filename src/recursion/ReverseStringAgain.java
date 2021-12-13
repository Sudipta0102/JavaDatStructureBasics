package recursion;

public class ReverseStringAgain {

	static String func(String s) {
		
		if(s.isEmpty()) {
			return "";
		}
		
		return func(s.substring(1))+s.charAt(0);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(func("you"));
		
	}
	
}
