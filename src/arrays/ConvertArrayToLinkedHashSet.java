package arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class ConvertArrayToLinkedHashSet {
	
	public static void func(String[] sArr) {
		
		Set<String> lhs = new LinkedHashSet<String>(Arrays.asList(sArr));
		
		
		System.out.println(lhs);
	}
	
	public static void funcAnother(String[] sArr) {
		
		Set<String> lhs = new LinkedHashSet<>();
		
		lhs.addAll(Arrays.asList(sArr));
		
		System.out.println(lhs);
		
	}

	public static void main(String[] args) {

		String[] sArr = {"kl","hjg","ds"};
		
		func(sArr);

		funcAnother(sArr);

	}

}
