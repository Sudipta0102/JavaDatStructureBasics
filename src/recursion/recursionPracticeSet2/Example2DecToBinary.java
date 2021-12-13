package recursion.recursionPracticeSet2;

public class Example2DecToBinary {

	static void func(int n) {
		
		if(n==0) {
			
			return;
			
		}
		else {
			
			func(n/2);
			System.out.print(n%2);
		
		}
		
	}
	
	public static void main(String[] args) {


		func(11);
		
		
		/*
		 * func(19) 
		 * func(9) 
		 * func(4) 
		 * func(2)
		 * func(1)
		 * func(0) 
		 * 
		 * 
		 */

	}

}
