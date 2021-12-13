package recursion.PracticeConfidenceGain;

public class PowerOfNumber {

	static int func(int num, int power) {
		
		if(power==0) {
			
			return 1;
			
		}
		
		return func(num, power-1)*num;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(func(4, 3));

	}

}
