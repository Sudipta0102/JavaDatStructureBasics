package strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConvertSetOfStrToSetOfInt {

	public static void func(Set<String>ss) {
		
		Set<Integer> si = new HashSet<>(ss.size());
		
		for(String str: ss) {
			
			si.add(Integer.valueOf(str));
		}
		
		System.out.println(si);
	}
	
	public static void main(String[] args) {

		Set<String> ss = new HashSet<>(Arrays.asList("1","2","3","4"));
		
		func(ss);
	}

}
