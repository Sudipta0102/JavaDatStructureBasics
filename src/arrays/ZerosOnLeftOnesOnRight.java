package arrays;

import java.util.Arrays;

public class ZerosOnLeftOnesOnRight {

	
	public static void func(int[] a) {
		
		int countZero = 0;
		int countOne = 1;
		
		int n = a.length;
		
		for(int i=0;i<n;i++) {
			//counting zero
			if(a[i] == 0) {
				
				countZero++;
			}
			//counting 1
			if(a[i] == 1) {
				
				countOne++;
			}
			
		}
		
		for(int i=0;i<countZero;i++) {
			
			a[i] = 0;
		}
		
		for(int i=countZero;i<(countZero+countOne)-1;i++) {
			
			a[i] = 1;
			
		}
		
		System.out.println(Arrays.toString(a));
	}
	
	
	//time complexity is O(nlog n)
	public static void funcAnother(int[] a) {
		
		int n = a.length;
		
		int leftPointer=0;
		
		for(int i=0;i<n;i++) {
			
			if(a[i]==0) {
							
				int temp = a[leftPointer];
				a[leftPointer] = a[i];
				a[i] = temp;
				
				leftPointer++;
			}
			
		}
		
		System.out.println(Arrays.toString(a));
		
	}
	
	public static void swap(int a , int b) {
		
		int temp = a;
		a= b;
		b=temp;
	}
	
	public static void main(String[] args) {


		int[] a = {0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0};
		
		System.out.println(Arrays.toString(a));
		
		func(a);

		System.out.println();
		
		int[] b = {0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0};
		
		funcAnother(b);
	}

}
