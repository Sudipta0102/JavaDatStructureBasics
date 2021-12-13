package arrays;

import java.util.HashSet;
import java.util.Set;

public class SetOfIntegerToSetOfString {
	
	public static void func(Set<Integer> si) {
		
		Set<String> ss = new HashSet<>();
		
		for(Integer i:si) {
			
			ss.add(String.valueOf(i));
			
		}
		
		System.out.println(ss);
	}

	public static void main(String[] args) {
		
		Set<Integer> hs = new HashSet<Integer>();
		
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		
		func(hs);
		
	}

}
