package recursion;

public class Factorial {
	
	static int func(int n) {
		
		//base condition
		if(n<=1) {
			
			return 1;
			
		}
		
		return n*func(n-1);
		
	}

	public static void main(String[] args) {
		
		System.out.println(func(4));
		
		

	}

}
