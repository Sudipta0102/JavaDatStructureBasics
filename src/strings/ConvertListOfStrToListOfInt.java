package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertListOfStrToListOfInt {
	
	public static void func(List<String> ls) {
		
		List<Integer> li = new ArrayList<>(ls.size());
		
		for(String str: ls) {
			
			li.add(Integer.valueOf(str));
			
		}
		
		System.out.println(li);
	}

	public static void main(String[] args) {

		List<String> ls = new ArrayList<String>(Arrays.asList("1","2","3","4"));
		
		func(ls);
		

	}

}
