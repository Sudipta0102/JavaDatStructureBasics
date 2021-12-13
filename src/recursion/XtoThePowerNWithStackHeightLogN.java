package recursion;

public class XtoThePowerNWithStackHeightLogN {

	static int func(int num, int power) {
		
		if(num == 0) {
			return 0 ;
		}
		if(power == 0) {
			return 1;
		}
		
		if(power%2==0) {			
			return func(num, power/2) * func(num, power/2);
		}else {			
			return func(num, power/2) * func(num, power/2)*num;	
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(func(2,2));
		
	}
}
