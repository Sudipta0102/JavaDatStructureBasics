package recursion.PracticeConfidenceGain;

public class SumOfDigits {
	
	static int getBaseValue(int num) {
		
		int count = 0;
		int baseVal = 1;
		
		while(num>0) {
			
			count++;
			num=num/10;
			
		}
		
		for(int i=1;i<count;i++) {
			
			baseVal = baseVal*10;
		}
		
		return baseVal;
	}

	static int func(int num) {
		
		int sum = 0;
		
		int c = getBaseValue(num);
		
		while(num>0) {
			
			sum = sum+num/c;
			num = num%c;
			c = c/10;
			
		}
		
		return sum;
	}
	
	static int funcAnother(int num) {
		
		int sum = 0;
		
		while(num>0) {
			
			int temp = num%10;
			
			sum = sum + temp;;
			
			num = num/10;
		}
		
		
		return sum;
	}
	
	public static int funcRec(int num) {
		
		if(num<=0) {
			
			return 0;
			
		}
		
		return funcRec(num/10) + num%10;
		
	}
	
	
	public static void main(String[] args) {
		
		//System.out.println(getBaseValue(1234));
		
		//System.out.println(funcAnother(1234));
		
		System.out.println(funcRec(1234));
		
	}

}
