package arrayInterviewQuestions.Array50GFG.Level1;

import java.util.Arrays;

public class Sort01And2 {

	public static void func(int[] a) {
		
		int hi = a.length-1;
		int lo = 0;
		int counter = 0;/*mid = 0*/
		
		while(counter<=hi) {
			
			switch(a[counter]) {
			
			case 0: {
				
				swap(a, lo, counter);
				lo++;
				counter++;
				break;
			}
			case 1: {
				
				counter++;
				break;
			}
			case 2: {
				
				swap(a, hi, counter);
				hi--;
				break;
			}	
			}	
			
			System.out.println(Arrays.toString(a));
		}
	}
	
	static void swap(int[] a, int i , int j) {
		
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
				
		
	}
	
	
	public static void main(String[] args) {
		
		int[] a = {1,2,1,1,1,0,2,0,0,2,1};
		
		System.out.println(Arrays.toString(a));
		
		func(a);
		
		System.out.println(Arrays.toString(a));
		
	}
}
