package strings;

public class SubStringSet {
	
	//O[n2]
	public static void func(String s) {
		
		int n = s.length();
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<=n;j++) {
				
				System.out.println(s.substring(i,j));
				
			}
		}
		
	}

	
	public static void func1(String s) {
	
		
		
	}
	
	public static void main(String[] args) {
		
		func("abcd");

	}

}
