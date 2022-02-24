package arrayInterviewQuestions;

public class CountEvennumberOfDigitsInAnArray {

	static int func(int[] a) {		
		int n = a.length;
		int count = 0;
		for(int i=0;i<n;i++) {
			
			if(numberOfDigitsAnother(a[i])%2==0)
				count++;
			
		}
		return count;
	}
	
	static int numberOfDigits(int num) {	
		if(num==0)
			return 1;		
		if(num<0) {
			num = num * -1;
		}
		
		int count = 0;		
		while(num>0) {		
			count++;			
			num = num / 10;
		}		
		return count;
	}
	
	static int numberOfDigitsAnother(int num) {
		
		if(num<0) {
			num = num * -1;
		}
		if(num == 0)
			return 1;
		
		return (int)Math.log10(num)+1;
		
	}
	
	public static void main(String[] args) {
		
		int[] a = {12, 345, 2, 6, 7896};
		
		System.out.println(func(a));
	
		System.out.println(numberOfDigitsAnother(-1000));
	}
}
