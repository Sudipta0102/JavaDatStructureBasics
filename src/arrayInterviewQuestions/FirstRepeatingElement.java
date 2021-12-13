package arrayInterviewQuestions;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class FirstRepeatingElement {

	static void func(int[] a) {
		
		int n = a.length;
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				
				if(j!=i && a[i] == a[j]) {
					
					System.out.println("First repeated element: "+a[i]);
					return;
				}
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] a = {5,2,1,3,4,1,3};
		
		func(a);
		
				
	}
}
