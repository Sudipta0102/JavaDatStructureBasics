package arrays;

import java.util.Arrays;

public class EvenAndOddElemntsInSeperateArrays {
	
	public static void func(int[] a) {
		
		int n = a.length;
		
		int oddCount = n/2;
		int evenCount = 0;
		
		if(n%2==0) {
			
			evenCount = n/2 ;
			
		}
		else {
			
			evenCount = n/2 +1;
			
		}
		
		//System.out.println(evenCount);
		
		int[] oddArr = new int[oddCount];
		int[] evenArr = new int[evenCount];
		
		int j=0;
		int k=0;
				
		
		for(int i=0;i<n;i++) {
			
			if(i%2==0) {
				
				evenArr[j] = a[i];
				j++;
			}
			else if(i%2!=0) {
				
				oddArr[k] = a[i];
				k++;
				
			}
			
		}
		
		System.out.println(Arrays.toString(evenArr));
		System.out.println(Arrays.toString(oddArr));
	}

	public static void main(String[] args) {
		
		int[] a = {4,8,5,3,0,7,6,2,1,2};
		
		func(a);
		
		

	}

}
