package strings.Strings50GFG.Level1;

import java.util.Arrays;

dynamic programming

public class CheckPanagram {

	static final int MAX_CHAR = 26;

	static boolean func(String s) {

		boolean[] b = new boolean[MAX_CHAR];

		System.out.println(Arrays.toString(b));

		int n = s.length();

		if (n >= MAX_CHAR) {
			for (int i = 0; i < n; i++) {

				char ch = s.toLowerCase().charAt(i);

				if ((ch>='a' && ch<='z') && b[ch - 'a'] == false) {

					b[ch - 'a'] = true;

				}

			}
			
			for(int i=0;i<b.length;i++) {
				
				if(b[i]!=true) {
					
					return false;
				}
				
			}

		}
		else {
			
			return false;
		}
		
		System.out.println(Arrays.toString(b));
		
		return true;
	}

	public static void main(String[] args) {

		String s = "Bawds jog, flick quartz, vex nymph";

		System.out.println(func(s));

		int i = s.charAt(0) - 'a';

		System.out.println(i);

	}

}
