package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertListOfStringToCommaSepString {

	public static void func(List<String> ls) {
		
		String res = "";
		
		for(String str : ls) {
			
			res = res + str +", ";
			
		}
		
		System.out.println(res.substring(0, res.length()-2));
	}
	
	public static void funcAnother(List<String> ls) {
		
		String res = String.join(",", ls);
		
		System.out.println(res);
		
	}
	
	public static void main(String[] args) {
		
		
		List<String> ls = new ArrayList<String>(Arrays.asList("I", "am", "you"));
		
		System.out.println(ls);

		func(ls);
		
		funcAnother(ls);
		
	}

}
