package DynamicProg.memoization;

//import java.util.ArrayList;
import java.util.HashMap;
//import java.util.List;
import java.util.Map;

public class Fibonacci {

	//List<Integer> l = new ArrayList<>();
	Map<Integer, Integer> memo = new HashMap<>();
	int count =0;
	
	public int fib(int n) {
		
		if(memo.containsKey(n))
			return memo.get(n);
		
		count++;
		
		if(n==0){
			
			memo.put(0, 0);
			return memo.get(n);
		}
		if(n==1){
			
			memo.put(1, 1);
			return memo.get(n);
		}
		
		int num = fib(n-1)+fib(n-2);
		memo.put(n, num);
		
		return num;		
	}
	
	public static void main(String[] args) {
		
		
		Fibonacci obj = new Fibonacci();
		
		int l = obj.fib(0);
		
		System.out.println(l);
		
		int i = 23;
		
		double d = i;
	}
}
