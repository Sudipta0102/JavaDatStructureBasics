package recursion.PracticeConfidenceGain;

public class reverseNumber {
	
	static void func(int num) {
		
		String s = "";
		
		while(num>0) {
			
			s = s+ num%10;
			
			num = num/10;
			
		}
		
		System.out.println(Integer.valueOf(s));
	}
	
	static void funcAnother(int num) {
		
		String numS = String.valueOf(num);
		String revS  = "";
		
		for(int i=numS.length()-1;i>=0;i--) {
			
			revS
			
		}
		
	}

	public static void main(String[] args) {

		func(120);

	}

}
