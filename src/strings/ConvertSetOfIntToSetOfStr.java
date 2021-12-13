package strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConvertSetOfIntToSetOfStr {
	
	public static void func(Set<Integer> si) {
		
		Set<String> ss = new HashSet<String>(si.size());
		
		
		for(Integer i : si) {
			
			ss.add(String.valueOf(i));
		}
		
		System.out.println(ss);
	}

	public static void main(String[] args) {
		
		Set<Integer> si = new HashSet<>(Arrays.asList(1,2,3,4));
		
		func(si);
		
		

	}

}
