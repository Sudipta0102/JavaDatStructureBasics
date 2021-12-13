package arrayInterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class SubArrayWithGivenSum {
	
	static void func(int[] a, int sum) {
		
		/*
		 * 1. Make a list
		 * 2. traverse the array 
		 * 3. while doing that, check the the current number is below the sum
		 * 4. it yes, add it to the list. 
		 * 
		 * 
		 */
		
		List<Integer> l = new ArrayList<>();
		int n = a.length;
		int temp = 0;
		
		for(int i=0;i<n;i++) {
			
			if(a[i]==sum) {
				
				l.add(a[i]);
				break;
			}
			else {
			
				l.add(a[i]);
				temp = temp +a[i];
			
				for(int j=i+1;j<n;j++) {
					
					temp = temp + a[j];
					if(temp<sum) {
						
						l.add(a[j]);
						
					}	
					
					else if(temp>sum) {
						
						l.clear();
						temp=0;
						break;
						
					}
					
					else {
						
						l.add(a[j]);
						System.out.println(l);
						break;
					}
				}	
			}
			if(temp==sum) {
				break;
			}
		}		
		
}	

	public static void main(String[] args) {
		
		int[] a = {2,1,0,4,3};
		
		func(a, 8);
		
	}
	
}	