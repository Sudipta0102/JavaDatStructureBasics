package strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConvertSetOfStringToCommaSepString {

	
	public static void func(Set<String> ss) {
		
		String res = "";
		
		for(String str: ss) {
			
			res = res + str +", ";
		}
			
		System.out.println(res.substring(0, res.length()-2));
		
	}
	
	//using join
	public static void funcAnother(Set<String> ss) {
		
		String res = String.join(",", ss);
		
		System.out.println(res);
		
	}
	public static void main(String[] args) {
		
		Set<String> ss =  new HashSet<>(Arrays.asList("I","Am","You"));

		System.out.println(ss);
		
		func(ss);
		
		funcAnother(ss);
	}

}
