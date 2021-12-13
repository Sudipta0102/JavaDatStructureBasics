package bitwise;

public class SwapVars {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 10;
		int c = a^b;
		a = c^(b=a);
		
		https://www.geeksforgeeks.org/swap-two-variables-in-one-line-in-c-c-python-php-and-java/
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("hellish " + 4);
		
	}
	
}
