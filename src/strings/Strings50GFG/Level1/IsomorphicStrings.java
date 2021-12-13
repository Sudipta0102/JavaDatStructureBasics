package strings.Strings50GFG.Level1;

public class IsomorphicStrings {

	static boolean func(String s1, String s2) {

		String s11 = "";
		String s22 = "";
		int len1 = s1.length();
		int len2 = s2.length();
		int count = 1;

		if (len1 == len2) {
			// encrypting the s1
			for (int i = 1; i < len1; i++) {
				if (s1.charAt(i) != s1.charAt(i - 1)) {

					s11 = s11 + s1.charAt(i - 1) + count;
					count = 1;
				} else {

					count++;
				}

				if (i == len1 - 1) {

					s11 = s11 + s1.charAt(i) + count;

				}
			}

			// encrypting the s2
			for (int i = 1; i < len2; i++) {
				if (s2.charAt(i) != s2.charAt(i - 1)) {

					s22 = s22 + s2.charAt(i - 1) + count;
					count = 1;
				} else {

					count++;
				}

				if (i == len1 - 1) {

					s22 = s22 + s2.charAt(i) + count;

				}

			}

			for (int i = 1; i < len1; i += 2) {

				char ch1 = s11.charAt(i);
				char ch2 = s22.charAt(i);

				if (ch1 != ch2) {

					return false;

				}

			}

		} else {

			return false;

		}

		return true;

	}

	public static void main(String[] args) {

		String s1 = "abb";
		String s2 = "xxy";

		System.out.println(func(s1, s2));
	}

}
