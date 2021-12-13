package recursion;

public class NumberOfSteps {

	static int countSteps(int num) {
		
		if(num==0)
			return 0;
		
		if(num%2==0) {
			
			return 1+countSteps(num/2); 
		}
		
		return 1+countSteps(num-1);
	}
	
	public static void main(String[] args) {
		
		int num = 14;
		
		System.out.println(countSteps(num));
	}
}
