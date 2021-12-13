package arrayInterviewQuestions;

import java.util.Arrays;

public class PlusOne {

	static int[] func(int[] a) {
		
		int n = a.length;
		int[] r = null;
		boolean flag = true;
		int carry = 0;
		
		for(int i=0;i<n;i++) {
			
			if(a[i]!=9) {	
				flag = false;;
				break;				
			}			
		}
		
		if(flag == true) {
			
			r = new int[n+1];
			r[0] = 1;
			for(int i=1;i<r.length;i++)
				r[i] = 0;		
		}
		else {
			
			r = new int[n];
			if(a[n-1]<9) {
			
				r[n-1] = a[n-1] +1;
				for(int i=0;i<=n-2;i++)
					r[i] = a[i];
						
			}
			else {
				
				r[n-1] = 0;
				carry = 1;
				for(int i=n-2;i>=0;i--) {
					
					if(carry==1 && i==0) {
						r[i] = a[i] + carry;
					}
					else if(a[i]<9 && carry==1) {
						r[i] = a[i] + carry;
						carry =0;
					}	
					
					else if(i!=0 && a[i]+1>9 && carry==1) { 
						r[i] = 0;
						carry = 1;
					} 		
					else
						r[i] = a[i];
						
				}
		
			}
			
		}
		
		return r;
	}
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3};
		
		int b[] = {9,9,9};
		
		int c[] = {9,8,7,6,5,4,3,2,1,0};
		
		int d[] = {9};
		
		int e[] = {9,8,8,9};
		
		System.out.println(Arrays.toString(func(e)));
		
	}
	
}
