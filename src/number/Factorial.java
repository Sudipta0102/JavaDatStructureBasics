package number;

public class Factorial {

	static int fact(int n) {
		
		int res = 1;
		
		for(int i=2;i<=n;i++) {
			res *= i;
		}
		
		return res;
	}
	
	static int factRec(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		
		return n*factRec(n-1);
	}
	
	public static void main(String[] args) {
		
		System.out.println(fact(10));
		System.out.println(factRec(5)); 
	}
}
