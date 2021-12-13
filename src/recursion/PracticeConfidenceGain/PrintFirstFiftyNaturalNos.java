package recursion.PracticeConfidenceGain;

public class PrintFirstFiftyNaturalNos {
	
	static void func(int limit) {
		
		if(limit==0) {
			
			return;
			
		}
		
		func(limit-1);
		
		System.out.print(limit + " ");
		
	}

	public static void main(String[] args) {
		
		func(50);

	}

}
