package DynamicProg.tabulation;

public class FibonacciTabulationBottomUp {

	static void func(int n) {
		
		int[] a = new int[n+1];
		
		a[0] = 0;
		a[1] = 1;
		
		for(int i=2;i<=n;i++) {
			
			a[i] = a[i-1] + a[i-2];
			
		}
		
		System.out.println(a[n]);
		
	}
	
	public static void main(String[] args) {
		
		func(6);
		
	}
	
}
