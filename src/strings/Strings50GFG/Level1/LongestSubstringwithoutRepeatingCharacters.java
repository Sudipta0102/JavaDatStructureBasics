package strings.Strings50GFG.Level1;

public class LongestSubstringwithoutRepeatingCharacters {

	static int func(String s) {
		
		if(s.isEmpty()) {
			return 0;
		}

		int maxCount = 1;
		int tempCount = 1;
		int n = s.length() - 1;
		String tempString = "";
		// String resString = "";

		for (int i = 0; i < n; i++) {

			tempString += s.charAt(i);

			if (searchChar(tempString, s.charAt(i + 1))) {

				if (tempCount > maxCount) {
					maxCount = tempCount;
					i = tempString.length()-2 - i;
					tempCount = 1;
					// resString = tempString;
					
					tempString ="";
					
				}

			} else {
				tempCount++;
			}
			
			
		
			if(i+1==s.length()-1 && tempCount>maxCount) {
				
				maxCount = tempCount;
			}
		}

		// System.out.println(resString);
		//System.out.println(maxCount);
		return maxCount;
		
	}
	
		

	static boolean searchChar(String s, char c) {

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == c) {
				return true;
			}

		}
		return false;
	}

	public static void main(String[] args) {

		String s = "pwwkew";

		System.out.println(func(s));

	}

}
