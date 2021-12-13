package recursion;

public class SUmOfNNaturalnos {
	
	static int func(int n) {
		
		if(n<=1) {
			
			return n;
			
		}
		
		return n+func(n-1);
	}

	public static void main(String[] args) {
	
		int sum = func(-2);
			
		System.out.println(sum);
		

	}

}
