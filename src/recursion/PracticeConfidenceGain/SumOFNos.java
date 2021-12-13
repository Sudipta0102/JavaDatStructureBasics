package recursion.PracticeConfidenceGain;

public class SumOFNos {

	static int func(int limit) {
		
		if(limit==0) {
			
			return 0;
		}
		
		return func(limit-1) + limit;
	}
	
	public static void main(String[] args) {


		System.out.println(func(4));
		
		

	}

}
