package arrays;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsBetweenTwoArerays {

	public static void func(int[] a, int[] b) {
		
		int n1 = a.length;
		
		int n2 = b.length;
		
		System.out.println("Common elements asre listed below:");
		
		for(int i=0;i<n1;i++) {
			
			for(int j=0;j<n2;j++) {
				
				if(a[i] == b[j]) {
					
					System.out.print(a[i] + " ");
					break;
					
				}
				
			}
			
		}
		
		
		System.out.println();
		
	}
	
	public static void funcAnother(int[] a, int[] b) {
		
		Set<Integer> hs1 = new HashSet<>();
		Set<Integer> hs2 = new HashSet<>();
		
		for(int i=0;i<a.length;i++) {
			
			hs1.add(a[i]);
			
		}
		
		for(int j=0;j<b.length;j++) {
			
			hs2.add(b[j]);
			
		}
		
		
		hs1.retainAll(hs2);
		
		
		System.out.println(hs1);
		
	}
	
	
	public static void main(String[] args) {
		
		int[] a = {4,8,5,3,0,7,6,2,1};
		
		int[] b = {4,8,5,3,0,7,6,2,1};
		

		func(a, b);
		// use set if you want to avoid same elements being displayed. 
		
		
		funcAnother(a, b);
	}

}
