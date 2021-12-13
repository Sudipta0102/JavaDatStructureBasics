package strings;

public class UnicodeCodePointGivenIndexOfAString {

	public static void main(String[] args) {

		String str = "mumumum";
		
		int r1 = str.codePointAt(0);
		int r2 = str.codePointAt(1);
		int r3 = str.codePointAt(2);
		int r4 = str.codePointAt(3);
		int r5 = str.codePointAt(4);
		int r6 = str.codePointAt(5);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
		System.out.println(r6);
	}

}
