package strings.Strings50GFG.Level1;

public class LongestSubstringwithoutRepeatingCharacters {

	
	

	static boolean searchChar(String s, char c) {

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == c) {
				return true;
			}

		}
		return false;
	}

	public static void main(String[] args) {

		String s = "ddvcdf";
		String s1 = "abcabcbb";

		System.out.println(func(s));

	}

}
