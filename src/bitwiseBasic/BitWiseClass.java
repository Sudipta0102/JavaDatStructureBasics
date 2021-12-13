package bitwiseBasic;

public class BitWiseClass {
	
	public static void func() {
		
	}

	public static void main(String[] args) {
		
		int a = 5;
		int b = 7;
		
		System.out.println(a|b);
		System.out.println(a&b);
		System.out.println(a^b);
		
		//this is 2's compliment, which is 
		//inverting the bits and adding 1 to that
		System.out.println(~a);  
		System.out.println(~b);
		
		//Number number;
		
		//number.
		
		int c = 42;
		
		System.out.println(Integer.toBinaryString(c));
		System.out.println(~c);
		
		int d = ~c;
		System.out.println(Integer.toBinaryString(d));
		
		System.out.println(42&15);
		System.out.println(42|15);
		System.out.println(42^15);
		

	}

}
