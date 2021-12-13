package recursion.recursionPracticeSet2;

public class Example1 {
	
	static int func(int n) {
		
		if(n==1) {
			
			return 0;
			
		}
		else {
			
			return 1+func(n/2);
		}
		
	}

	public static void main(String[] args) {

		
		System.out.println(func(16));
		
		/*
		 * 1+func(8) 1
		 * 1+func(4) 1
		 * 1+func(2) 1
		 * 1+func(1) 1+0 = 1
		 * 
		 */
	}

}
