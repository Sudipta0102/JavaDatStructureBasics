package DynamicProg.memoization;

import java.util.Arrays;

public class FibonacciMemoizationTopDown {

	static int count0 = 0;
	static int count = 0;
	static int count1 = 0;
	
	static int fib(int n) {
		
		count0++;
		
		if(n==0) return 0;
		if(n==1) return 1;
		
		int sum = fib(n-1) + fib(n-2);
		
		return sum;
		
	}
	
	//it doesn't work fully. 
	//I don't quite know how to solve this
	//function calls itself 19 times here, 
	//supposed to be 11
	// but i dunno how, need to debug more
	static int fibDynamic(int n, int memo[]) {
		
		//made four cases
		
		
		//int sum = 0;
		
		count++;
		
		if(n==0) {
			
			memo[n] = 0;
			return 0;
		}
		if(n==1) {
			
			memo[n] = 1;
			return 1;
		}
		
		//1. memo has everything needed
		if(memo[n-1]!=-1 && memo[n-2]!=-1) {
			
			
			memo[n] = memo[n-1] + memo[n-2];
			
		}
		
		//2. memo has n-1
		if(memo[n-1]!=-1 && memo[n-2]==-1) {
						
			memo[n] = memo[n-1] + fibDynamic(n-2, memo);
			
			// return sum;
		}
		
		//memo has n-2
		if (memo[n-1]==-1 && memo[n-2]!=-1){
			
			memo[n] = fibDynamic(n-1, memo) + memo[n-2];
			
		}
		
		//memo doesn't have anything
		if(memo[n-1]==-1 && memo[n-2]==-1) {
			
			memo[n] = fibDynamic(n-1, memo) + fibDynamic(n-2, memo);
		
		}
		return memo[n];
	}
	
	//fixed it here...
	//lesson: need to refine my thinking
	//i was stupid...
	//i still am but not in this case
	static int fibAgain(int n, int[] m) {
		
		if(m[n]!=-1) {
			
			return m[n];
			
		}
		
		count1++;
		
		if(n==0) {
			
			m[n] = 0;
			return 0;
			
		}
		if(n==1) {
			
			m[n] = 1;
			return 1;
			
		}
		
		m[n] = fibAgain(n-1, m)+fibAgain(n-2, m);
		
		return m[n];
		
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(fib(10));
		System.out.println(count0);
		
		int n = 10;
		//n+1 because n in fibonacci starts from 0;
		//so, in this case 0 to 10 means 11(n+1)
		int[] memo = new int[n+1];
		
		for(int i=0;i<memo.length;i++) {
			
			memo[i] = -1;
			
		}
		
		System.out.println(Arrays.toString(memo));
		
		System.out.println(fibDynamic(n, memo));
		
		System.out.println(count);
		
		
		int n1 = 10;
		//n+1 because n in fibonacci starts from 0;
		//so, in this case 0 to 10 means 11(n+1)
		int[] memo1 = new int[n+1];
		
		for(int i=0;i<memo1.length;i++) {
			
			memo1[i] = -1;
			
		}
		
		System.out.println(fibAgain(n1, memo1));
		System.out.println(count1);
	}
	
}
