package recursion.recursionString;

public class CountSubstringsWithSameFirstAndLastCharacters {

	public static void func(String s) {
		
		int count = 0;
		
		int n = s.length();
		
		for(int i=0;i<n;i++) {
			
			for(int j =i+1;j<=n;j++) {
				
				String tempS = s.substring(i, j);
				
				//System.out.println(tempS);
				
				if(tempS.charAt(0) == tempS.charAt(tempS.length()-1)) {
					
					System.out.println(tempS);
					count++;
					
				}
				
				
			}
		}
		
		System.out.println(count);
		
	}
	
	static int funcRec(String s, ) {
		
	}
	
	public static void main(String[] args) {

		String s = "abcab";
		
		func(s);
		
	}

}
