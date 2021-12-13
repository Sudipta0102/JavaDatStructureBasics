package strings;

public class SubStringSplit {
	
	public static void func(String str) {
		
			int n = str.length();
			int x = 1;
			
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<=n;j++) {
					System.out.println(x++ +". "+str.substring(i, j));
				}
			}
		
	}

	public static void main(String[] args) {
		
		func("the cat");
		

	}

}
