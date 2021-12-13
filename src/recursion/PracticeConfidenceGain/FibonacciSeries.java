package recursion.PracticeConfidenceGain;

public class FibonacciSeries {
	
	static int func(int limit) {
		
		if(limit<=1) {
			
			return limit;
			
		}
		
		else
			
			return func(limit-1) + func(limit-2);
		
	}

	public static void main(String[] args) {
		
		int n = 5;
		
		System.out.println(func(n));

	}

}
