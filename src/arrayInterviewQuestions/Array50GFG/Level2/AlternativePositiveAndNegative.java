package arrayInterviewQuestions.Array50GFG.Level2;

import java.util.Arrays;

public class AlternativePositiveAndNegative {

	//O(n) space solution
	//Merge sort approach
	static void func(int[] a) {
		
		int n = a.length;
		
		int pos = 0, neg = 0;
		
		for(int i=0;i<n;i++) {
			
			if(a[i]<0)
				neg++;
			else
				pos++;
				
		}
		
		System.out.println(pos);
		System.out.println(neg);
		
		int[] pArr = new int[pos];
		int[] nArr = new int[neg];
		int pIdx = 0, nIdx = 0;
		
		for(int i=0;i<n;i++) {
			
			if(a[i]<0) {
				
				nArr[nIdx] = a[i];
				nIdx++;
				
			}else {
				
				pArr[pIdx] = a[i];
				pIdx++;
			}
		}
		
		System.out.println(Arrays.toString(pArr));
		System.out.println(Arrays.toString(nArr));
		
		int i = 0, j =0, k = 0;
		
		while(i<pos && j<neg) {
			
			if(k%2==0) {
				
				a[k] = nArr[j];
				k++;j++;
				
			}else {
				
				a[k] = pArr[i];
				k++;i++;
			}
			
		}
		
		while(i<pos) {
			
			a[k] = pArr[i];
			i++;
			k++;
		}
		
		while(j<neg) {
			
			a[k] = nArr[j];
			j++;
			k++;
		}
		
		System.out.println(Arrays.toString(a));
		
	}	

	static void funcAgain(int[] a) {
		
		int n = a.length;
		
		int posC = 0;
		int negC = 0;
		
		//1. separate +ve and -ve without changing the order.
		for(int i=0;i<n-1;i++) {
			
		
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		int Arr[] = {5, -2, -5, 2, 4, 7, 1, 8, 0, -8};
		
		System.out.println(Arrays.toString(Arr));
		
		func(Arr);
		
	}
	
}
