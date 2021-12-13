package strings.Strings50GFG.Level1;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	static void func(String s) {

		Map<Character, Integer> hm = new HashMap<>();

		/*
		 * I 1 V 5 X 10 L 50 C 100 D 500 M 1000
		 */

		hm.put('I', 1);
		hm.put('V', 5);
		hm.put('X', 10);
		hm.put('L', 50);
		hm.put('C', 100);
		hm.put('D', 500);
		hm.put('M', 1000);

		int res = 0;

		for (int i = 0; i < s.length(); i++) {

			char ch1 = s.charAt(i);
			int val1 = hm.get(ch1);
			

			if (i + 1 < s.length()) {

				char ch2 = s.charAt(i + 1);
				int val2 = hm.get(ch2);
				
				if (val1 >= val2) {

					res = res + val1;

				} else {

					res = res + val2 - val1;
					i++;
				}

			}
			else {
				
				res = res + val1;
			}
		}

		
		System.out.println(res);
	}

	public static void main(String[] args) {

		String s = "MCMXCIV";// 1994
		String s1 = "LVIII";// 58
		String s3 = "XVIV";
		
		func(s);
	}

}
