package strings;

public class SwappingPairsOfCharacters {
	
	static void func(String str) {
		
		int n = str.length();
		String res = "";
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<n;i+=2) {
			
			if(i+1 == str.length()) {
				
				sb = sb.append(str.charAt(i));
				break;
			}
			
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(i+1);
			
			sb = sb.append(ch2).append(ch1);
			//res = sb.toString();
		}
		
		System.out.println(sb.toString());
		
	}
	
	public static void main(String[] args) {
		
		String str = "GeeksforGeeks";
		String str1 = "java";
		func(str1);
		
	}

}
