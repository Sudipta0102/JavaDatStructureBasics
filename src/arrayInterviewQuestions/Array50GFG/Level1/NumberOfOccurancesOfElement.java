package arrayInterviewQuestions.Array50GFG.Level1;

import java.util.HashMap;
import java.util.Map;

public class NumberOfOccurancesOfElement {

	static void func(int[] a, int element) {
		
		Map<Integer, Integer> hm = new HashMap<>();
		
		int n = a.length;
		Integer freq = null;
		
		for(int i=0;i<n;i++) {
			
			if(hm.containsKey(a[i])) {
				hm.put(a[i], hm.get(a[i])+1);		
			}
			else {
				
				hm.put(a[i], 1);
			}
			
		}
		
		
		
		System.out.println(hm);
		
		for(Map.Entry<Integer, Integer> entry:hm.entrySet()) {
			
			if(entry.getKey() == element) {
				
				System.out.println(entry.getValue());
				break;
			}
			
		}
		
	}
	
	static void funcAgain(int[] a, int element) {
		
		int count = 0;
		
		int n = a.length;
		
		for(int i =0;i<n;i++) {
			
			if(a[i]==element) {
				
				count++;
				
			}
			
		}
		
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		
		int[] a = {1, 1, 2, 1, 2, 1, 1, 2, 2};
		
		func(a, 2);
		funcAgain(a, 2);
	}
	
}
