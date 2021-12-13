package recursion;

public class PowerOfX {

	private static double func(double x, int n) {
		
		if(n==0)
			return 1;
		
		if(n>0)
			return x*func(x, n-1);
		else
			return 1/x*func(x, n+1);
		
		
	}
	
	public static void main(String[] args) {
		
		double d = func(2.000, -3);
		
		System.out.println(d);
	}
}
