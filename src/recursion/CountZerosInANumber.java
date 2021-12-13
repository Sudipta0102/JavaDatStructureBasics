package recursion;

public class CountZerosInANumber {
	
	//doesn't work for leading zeros 
	//and num = 0 (i.e. also a leading zero)
	static int countZeros(int num) {
		
		if (num==0)
			return 0;
		
		if(num%10 == 0)
			return 1 + countZeros(num/10);
		
		return countZeros(num/10);
	}
	
	public static void main(String[] args) {
		
		int num = 100001;
		
		System.out.println(countZeros(num));
	}

}
