package recursion;

import java.util.HashMap;

public class ClimbingStairs {

	static HashMap<Integer, Integer> memo = new HashMap<>();		
	static int func(int n) {
		
		if(memo.containsKey(n))
			return memo.get(n);
		int sum = 0;
		
		if(n<1)
			return 1;
				
		int n1=0, n2=0;
		
		if(n>=2) { 
			n2 = func(n-2) ;
		}
		
		n1 = func(n-1);
		
		sum = n1 + n2;
		
		memo.put(n, sum);
		
		return sum;
	}
	
	static int funcAnotherSame(int n) {
		
		if(memo.containsKey(n))
			return memo.get(n);
		if(n<1)
			return 1;
				
		int n1=0, n2=0;
		
		if(n>=2) { 
			n2 = func(n-2) ;
		}
		
		n1 = func(n-1);
		
		n1 = n1 + n2;
		
		memo.put(n, n1);
		
		return n1;
	}
	
	public static void main(String[] args) {
		
		System.out.println(func(45));
		
		System.out.println(funcAnotherSame(45));
		
	}
	
}
