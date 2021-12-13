package recursion.PracticeConfidenceGain;

public class NUmberOfDigits {

	static int func(int num) {
		
		if(num==0) {
			
			return 0;
			
		}
		
		return func(num/10)+1;
		
	}
	
	
	public static void main(String[] args) {
		
		int num = 3333;
		
		System.out.println(func(num));
		

	}

}
