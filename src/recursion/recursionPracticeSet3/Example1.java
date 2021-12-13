package recursion.recursionPracticeSet3;

public class Example1 {

	public static void func(int n) {
		
		int i=0;
		if(n>1) {
			
			func(n-1);
			
		}
		for(i=0;i<n;i++) {
			System.out.print(" * ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		func(5);
		
	}
	
}
