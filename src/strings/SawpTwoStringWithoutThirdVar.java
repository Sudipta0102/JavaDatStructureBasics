package strings;

public class SawpTwoStringWithoutThirdVar {

	public static void func(String a, String b) {
		
		a = a+b;
		System.out.println(a);
		b = a.substring(0, a.length()-b.length());
		System.out.println(b);
		a= a.substring(b.length());
		System.out.println(a);
		
		//System.out.println("a: "+a);
		//System.out.println("b: "+b);
	}
	
	public static void main(String[] args) {


		func("I","You");

	}

}
