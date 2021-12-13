package number;

public class NumberOfDigits {

	static int countDigit(int num) {		
		
		int digitCount = 0;
		do {			
			num = num/10;
			digitCount++;			
		}while(num>0);		
		
		return digitCount;
	}
	
	public static void main(String[] args) {
		
		System.out.println(countDigit(123456));
		
	}
}
