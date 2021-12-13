package arrayInterviewQuestions.Array50GFG.Level2;

import java.util.Arrays;

public class MaxSumInConfiguration {

	static void func(int[] a) {
		
		int b[] = new int[2*a.length];
		int i = 0;
		for(int num : a) {
			
			b[i] = num;
			i++;
			
		}
		
		for(int num : a) {
			
			b[i] = num;
			i++;
			
		}
		
		int n = b.length;
		int sum = 0, maxSum = Integer.MIN_VALUE;
		int k = 0;
		int start = 0;
		
		for(int j=0;j<n-1;j++) {
			
			sum+=b[j]*k;
			k++;
			
			if(k>a.length-1) {		
				j = start;
				start++;
				k = 0;
				if(maxSum<sum) {					
					maxSum = sum;		
				}
				sum = 0;
			}		
		}
		
		System.out.println(maxSum);		
	}
	
	//sumNow = sumBefore -(arraySum - a[i-1]) + a[i-1] * (n-1)
	static void funcOptimized(int[] a) {
	
		int n = a.length;
		int arraySum = 0, sum = 0, j = 0;
		
		for(int i : a) {
			arraySum+=i;
			sum += i*j;
			j++;
			
		}
		
		int maxSum = Integer.MIN_VALUE;
		for(int i=1;i<n;i++) {
			sum = sum -(arraySum - a[i-1]) + a[i-1] * (n-1);		
			if(sum>maxSum) {			
				maxSum  = sum;
			}
			
		}
		
		System.out.println(maxSum);
	}
	
	public static void main(String[] args) {
		
		int[] a = {8,3,1,2};
		
		funcOptimized(a);
		
	}
}
