package arrays;

import java.text.DecimalFormat;

public class FindRatiosOfPositiveNegativeZeroElements {

	public static void func(int[] a) {
		
		int zeroCount = 0;
		int positiveCount = 0;
		int negativeCount = 0;
		int n = a.length;
		
		
		for(int i=0;i<n;i++) {
			
			if(a[i]==0) {
				
				zeroCount++;
				
			}
			else if(a[i]<0) {
				
				negativeCount++;
			}
			else {
				
				positiveCount++;
			}
		}
		
		//1st way
		Float zeroRatio = 1.4f;		
		zeroRatio = (float)zeroCount/n;
		System.out.println(zeroRatio);
		
		//2nd way
		System.out.printf("%1.4f ", (float)positiveCount/n);	
		System.out.println();
		
		//3rd way
		DecimalFormat df = new DecimalFormat();
		df.setMaximumIntegerDigits(3);
		System.out.println(df.format((float)negativeCount/n));
		
	}
	
	
	public static void main(String[] args) {

		int[] a = {2, -1, 5, 6, 0, -3}; 
		

		func(a);
		
	}

}
