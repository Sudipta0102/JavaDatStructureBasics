package number;

public class ArmstrongNumber {

	static boolean isArmstrong(int num) {
		
		// an armstrong number is sum of the cube of its digits like 
		// 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153 is armstrong number
		
		int sum = 0;
		int temp = num;
		
		while(temp>0) {
			
			int rem = temp%10;			
			sum += getCube(rem);		
			temp = temp/10;
			
		}	
		return sum == num;
	}
	
	static int getCube(int n) {		
		return n*n*n;
	}

	public static void main(String[] args) {
		
		System.out.println(isArmstrong(407));
		
		System.out.println(getCube(5));
		
	}
	
}
