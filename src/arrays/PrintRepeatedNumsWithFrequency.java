package arrays;

import java.util.HashMap;
import java.util.Map;

public class PrintRepeatedNumsWithFrequency {
	
	public static void func(int[] a) {
		
		Map<Integer,Integer> hm = new HashMap<>();
		int count = 0;
		
		for(int i=0;i<a.length;i++) {
			
			if(hm.containsKey(a[i])) {
				
				hm.put(a[i], count++);
			}
			
			else {
				hm.put(a[i], 1);
			}
		}
		
		
		System.out.println(hm);
	}
	
	//without using map
	public static void funcAnother(int[] a) {
	
		int n = a.length;
		int 
		
				
		
		
	}

	public static void main(String[] args) {
		
		int[] a = {42,32,53,87,42,53,87,32,42,42};

		func(a);
		
	}

}
