package recursion.recursionPracticeSet3;

public class Example2 {

	static int LIMIT = 1000;
	
	static void func(int n) {
		
		if(n<=0 || n>LIMIT) {
			
			return;
			
		}
		
		System.out.print(String.format("%d ", n));
		func(2*n);
		System.out.print(String.format("%d ", n));
		
		
	}
			
	
	public static void main(String[] args) {

		func(4);	
		

	}

}
