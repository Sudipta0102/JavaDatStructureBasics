package number;

public class BaseAndExponenet {

	static void func(int base, int exponent) {
		
		int result = 1;
		
		do {
		
			result *= base;
			exponent--;
			
		}while(exponent>0);
		
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		
		func(5, 4);
		
	}
}
