package arrayInterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class Duplicates {

	static void func(int[] a) {
		
		Set<Integer> s = new HashSet<>();
		
		int n = a.length;
		
		for(int i=0;i<n;i++) {
			
			if(!s.add(a[i])) {
				
				System.out.print(a[i]+ " ");
				
			}		
				
		}
			
		
		System.out.println();
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		int a[] = {2,3,1,2,3};
		
		func(a);
		
	}
	
}
