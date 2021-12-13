package recursion.PracticeConfidenceGain;

public class Factorial {

	static int func(int num) {
		
		if(num==0) {
			
			return 1;
		}
		
		return func(num-1)*num;
	}
	
	public static void main(String[] args) {

		System.out.println(func(5));

	}

}
