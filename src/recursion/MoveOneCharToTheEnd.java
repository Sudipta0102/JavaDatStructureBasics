package recursion;

public class MoveOneCharToTheEnd {

	static void func(String str, char c, int len) {

		if (len == str.length()) {

			System.out.println(str);
			return;

		}

		int n = str.length() - 1;

		if (str.charAt(len) != c) {

			func(str, c, len + 1);
		} else {

			// swap the value with the last non x value
			// how do i get to this?
			// you run while loop from the last char to get the
			// first non x value
			while (n >= 0 && str.charAt(n) == c) {

				n--;

			}

			if (len < n) {
				// swap str.charAt(len) and str.charAt(n)
				StringBuilder sb = new StringBuilder(str);

				char lenChar = sb.charAt(len);
				sb.setCharAt(len, sb.charAt(n));
				sb.setCharAt(n, lenChar);

				str = sb.toString();

				
			}
			
			func(str, c, len + 1);
		}

	}
	
	
	//this function works just fine, but not optimized 
	static void funcAnother(String s, char c, int len) {
		
		if(len == s.length()) {
			
			
			System.out.println(s);
			return;
			
		}
		
		if(s.charAt(len)!=c) {
				
			int key = len;
			
			while(key>0 && s.charAt(key-1)==c) {
				
				key--;
							
			}
			
			StringBuilder sb = new StringBuilder(s);
			
			char first = sb.charAt(key);
			char last = sb.charAt(len);
			sb.setCharAt(key, sb.charAt(len));
			s=sb.toString();
			sb.setCharAt(len, first);
			
			s=sb.toString();
				
		}
		
		funcAnother(s, c, len+1);
		
	}
	public static void main(String[] args) {
		String str = "bgfxabcxfxxhxx";

		func(str, 'x', 0);
	}
}
