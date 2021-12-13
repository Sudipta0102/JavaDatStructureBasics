package recursion;

public class SkipACharacterInAString {

	static String func(String s, char c) {
		//baccad
		if(s.isEmpty()) {
			return "";
		}
		
		if(s.charAt(0)!=c)
			return s.charAt(0) + func(s.substring(1), c);
		else
			return func(s.substring(1), c);
		
	}

	//taking answer string as an argument
	static String funcAnother(String s, char ch, String ans) {
		
		if(s.isEmpty()) {			
			return ans;		
		}
		
		if(s.charAt(0)!=ch) 
			ans+= s.charAt(0);
			//return funcAnother(s.substring(1), ch, ans);
			
		return funcAnother(s.substring(1), ch, ans);
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(func("baccad", 'a'));
		
		//System.out.println(funcAnother("baccad", 'a', ""));
	}
	
	
}
