package arrayInterviewQuestions.Array50GFG.Level2;

import java.util.HashMap;
import java.util.Map;
//import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class FirstNonRepeatingElement {

	//hashing is the way to get O(n) solution out of this
	//but space also would be O(n)
	static void func(int[] a) {
		
		Map<Integer, Integer> m = new HashMap<>();
		int n = a.length;
		
		for(int i =0;i<n;i++) {
			
			Integer freq = m.get(a[i]);
			m.put(a[i], (freq==null)?1:freq+1);
			
		}
		
		System.out.println(m);
		
		for(Map.Entry<Integer, Integer> hm: m.entrySet()) {
			
			if(hm.getValue()==1) {
				
				System.out.println(hm.getKey());
				break;
				
			}
			
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {-1, 2, -1, 3, 2, 4};
		
		func(arr);
		
	}
	
}
