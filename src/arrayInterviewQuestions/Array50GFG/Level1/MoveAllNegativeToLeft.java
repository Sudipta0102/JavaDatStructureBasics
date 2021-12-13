package arrayInterviewQuestions.Array50GFG.Level1;

import java.util.Arrays;

public class MoveAllNegativeToLeft {

	//in this, the relative order of array elements 
	//are changed
	static void func(int[] a) {
		
		int lo=0;
		int hi = a.length-1;
		
		while(lo<hi) {
			
			if(a[lo]<0) {
				
				lo++;
				
			}
			else {
				
				int temp = a[lo];
				a[lo] = a[hi];
				a[hi] = temp;
				
				hi--;
			}
			
		}
		
	}
	
	
	//with extra space
	static void funcAgain(int[] a) {
		
		int n = a.length;
		int b[] = new int[n];
		//int count = 0;
		int j =0;
		
		for(int i=0;i<n;i++) {
			
			if(a[i]>0) {
				
				b[j] = a[i];
				j++;
				
			}			
		}
		
		for(int i=0;i<n;i++) {
			
			if(a[i]<0) {
				
				b[j] = a[i];
				j++;
			}
			
		}
		
		System.out.println(Arrays.toString(b));
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {-5, 7, -3, -4, 9, 10, -1, 11};
		
		System.out.println(Arrays.toString(arr));
		
		//func(arr);
		
		//System.out.println(Arrays.toString(arr));
		
		funcAgain(arr);
		
		//System.out.println(Arrays.toString(arr));
	}
}
