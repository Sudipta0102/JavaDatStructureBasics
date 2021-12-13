package arrayInterviewQuestions.Array50GFG.Level1;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class KthSmallestElement {

	static void func(int[] a, int k) {
	
		Set<Integer> ts = new TreeSet<>();
		 
		for(Integer i : a) {
			
			ts.add(i);
			
		}
		
		System.out.println(ts);
		
		Iterator<Integer> it = ts.iterator();
		int i = 0;
		
		while(it.hasNext()) {
	
			
			if(i==k-1) {
				System.out.println(it.next());
				break;
			}	
			i++;
			it.next();
		}	
	}
	
	 

		 
	public static void main(String[] args) {
	
		 int [] a = {3,5,1,0,5};
		 
		 func(a, 4);
	} 
}
