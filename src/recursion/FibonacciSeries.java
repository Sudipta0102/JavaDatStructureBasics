package recursion;

public class FibonacciSeries {
	
	//1,1,2,3,5,8,13,21....
	static int func(int n) {
		
		if(n<=1) {
			
			System.out.println("your value is: " +n+ " and its Fibonacci value is: "+n);
			return 1;
			
		}
		else {
			System.out.println("your value is: " +n+ " and its Fibonacci value is: "+func(n - 1) + func(n - 2));
			return func(n-1) + func(n-2);
		
		}
	}
	
	static int funcFib(int n){
		
		if(n==0 || n==1) {
			
			return 1;
		}
		else {
			
			
			int fib1 = funcFib(n-1);
			int fib2 = funcFib(n-2);
			int fibSum = fib1+fib2;
			return fibSum;
		}
	}

	public static void main(String[] args) {

		for(int i=0;i<10;i++) {
			
			System.out.println(funcFib(i)+ "   ");
			
		}

	}

}
