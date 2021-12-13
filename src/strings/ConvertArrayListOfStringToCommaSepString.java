package strings;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayListOfStringToCommaSepString {

	public static void func(ArrayList<String> als) {
		
		String res = String.join(",", als);
		
		System.out.println(res);
		
	}
	
	public static void funcAnother(ArrayList<String> als) {
		
		String res = "";
		
		for(String str: als) {
			
			res = res + str + ", ";
		}
		
		System.out.println(res.substring(0, res.length()-2));
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> als = new ArrayList<>(Arrays.asList("I", "am", "you"));
		
		System.out.println(als);

		func(als);
		
		funcAnother(als);
	}

}
