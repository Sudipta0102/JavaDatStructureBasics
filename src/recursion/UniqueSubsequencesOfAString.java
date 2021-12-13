package recursion;

import java.util.HashSet;

public class UniqueSubsequencesOfAString {

	static HashSet<String> func(String s, String result) {
		
		HashSet<String> hs = new HashSet<String>();
		if(s.isEmpty()) {
			hs.add(result);
			return hs;
		}
		
		HashSet<String> left = func(s.substring(1), result+s.charAt(0));
		HashSet<String> right = func(s.substring(1), result);
		
		left.addAll(right);
		
		return left;
	}
	
	public static void main(String[] args) {
		
		String s = "aba";
		//HashSet<String> hs = new HashSet<>();
		System.out.println(func(s, ""));
	}
}
