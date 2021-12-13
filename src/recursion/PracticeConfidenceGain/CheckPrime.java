package recursion.PracticeConfidenceGain;

public class CheckPrime {

//	static boolean func(int num) {
//		
//		
//		
//	}
	
	public static void func(int num) {
		
		int flag = 0;
		
		for(int i=2;i<=num;i++) {
			
			if(num%i==0 && num!=i) {
			
				flag =1;
				System.out.println("not prime");
				break;
				
			}
						
		}
		
		if(flag==0) {
			
			System.out.println("prime");
			
		}
		
	}
	
	public static void main(String[] args) {
		
		func(7);

	}

}
