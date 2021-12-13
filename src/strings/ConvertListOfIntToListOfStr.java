package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertListOfIntToListOfStr {
	
	public static void func(List<Integer> li) {
		
		List<String> ls = new ArrayList<>(li.size());
		
		for(Integer i : li) {
			
			ls.add(String.valueOf(i));
			
			
		}
		
		System.out.println(ls);
		
		
	}

	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<>(Arrays.asList(1,2,3,4));
		
		func(li);
		

	}

}
