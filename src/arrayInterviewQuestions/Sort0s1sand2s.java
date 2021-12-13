package arrayInterviewQuestions;

import java.util.Arrays;

public class Sort0s1sand2s {

	static void func(int[] a) {
		
		int countZ = 0;
		int countO = 1;
		int countT = 2;
		int n = a.length;
		
		for(int i=0;i<n;i++) {
			
			if(a[i]==0) {
				
				countZ++;
				
			}
			
			if(a[i]==1) {
				
				countO++;
				
			}
			
			
			if(a[i]==2) {
				
				countT++;
				
			}
		}
		
		for(int i=0;i<n;i++) {
			
			if(i<countZ) {
				
				a[i] = 0;
				
			}
			
			else if(i>=countZ && i<countZ+countO-1) {
				
				a[i] = 1;
			}
			else {
				
				a[i] = 2;
				
			}
		}
		
		System.out.println(Arrays.toString(a));
		
	}
	
	public static void main(String[] args) {
		
		int[] a = {0,1,2,0,0,0,1,1,1,0,0,0,0,2,2,0,2,1};
		
		System.out.println(a.length);
		
		func(a);
		
	}
	
}
