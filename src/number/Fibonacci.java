package number;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Fibonacci {
	//For each
	static void itrHashSet1(Set<Integer> hs) {
		for(Integer num: hs) {
			System.out.println(num);	
		}			
	}
	
	//Iterator
	static void itrHashSet2(Set<Integer> hs) {
		
		Iterator<Integer> itr = hs.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Set<Integer> hs = new HashSet<>();
		
		hs.add(2);
		hs.add(5);
		hs.add(1);
		hs.add(7);
		hs.add(0);
		
		System.out.println(hs);
		
		//itrHashSet(hs);
		
		itrHashSet1(hs);
		System.out.println();
		itrHashSet2(hs);
	}
	
}
