package recursion.PracticeConfidenceGain;

public class PrintEvenOdd {

	static void func(int limit) {
		
		if(limit==0) {
			
			return;
			
		}
		
		
		func(limit-1);
		if(limit%2==0) {
			
			System.out.print(limit+ " ");
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		func(10);

	}

}
