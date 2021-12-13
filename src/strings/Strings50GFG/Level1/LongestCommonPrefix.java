package strings.Strings50GFG.Level1;

public class LongestCommonPrefix {

	static String func(String[] s) {
		
		String r = "";
		int n = s.length;
		
		for(int i=0;i<s[0].length();i++) {
			char ch1 = s[0].charAt(i);	
			for(int j=1;j<n;j++) {	
				char ch2 = s[j].charAt(i);		
				if(ch1!=ch2 || i>=s[j].length()) {			
					return (r=="")?"-1":r;
				}		
			}	
			r += s[0].charAt(i);	
		}
		
		return r;
	}
	
	public static void main(String[] args) {
		
		String[] arr = {"geeksforgeeks", "geeks", "geek", "geezer"};
		String[] arr1 = {"hello", "world"};
		
		System.out.println(func(arr));
		
	}
	
}
