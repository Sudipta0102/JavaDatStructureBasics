package arrayInterviewQuestions;

import java.util.Arrays;

public class CyclicallyRotateByOne {
	
	static void func(int[] a) {
		
		int n = a.length;
		int j = 0;
		//int last = a[n-1];
		int key = a[0];
		int x = 0;
		for(int i=0;i<n-1;i++) {
			
			//j = i+1;
			x = a[i+1];
			a[i+1] = key;
			
			key = x ;
			
			
		}
		
		a[0] = key;
		
		
		System.out.println(Arrays.toString(a));
	}
	
	public static void funcA(int[] a) {
		
		int n = a.length;
		int temp = a[0];
		int x = 0;
		
		//int last = a[n-1];
		for(int i=1;i<n;i++) {
			
			x=a[i];
			a[i]=temp;
			
			temp = x;
				
		}
		
		a[0] = temp;
		
		System.out.println(Arrays.toString(a));
		
	}
	
	static void funcB(int[] a, int t) {
		
		int n = a.length;
		
		for(int i =0;i<n;i++) {
			
			
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5};
		
		int A[] = {9, 8, 7, 6, 4, 2, 1, 3};
		
		funcA(a);
	}

}
