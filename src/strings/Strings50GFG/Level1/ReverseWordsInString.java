 package strings.Strings50GFG.Level1;

public class ReverseWordsInString {

	static String func(String s) {
		
		String[] sArr = s.split("\\.");	
		
		String r = "";
		
		
		for(int i = sArr.length-1;i>=0;i--) {
			
			r = r + sArr[i] + ".";
			
		}
		
		return r.substring(0, r.length()-1);
		
	}
	
	static String reverse(String s) {
		
		String r = "";
		
		for(int i=s.length()-1;i>=0;i--)
			r+=s.charAt(i);
		
		return r;
		
	}
	
	public static void main(String[] args) {
	
		String s = "i.like.this.program.very.much";
		
		String r = func(s);
		
		System.out.println(r);
		
	}
}
