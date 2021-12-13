package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertStringIntoCommaSepList {
	
	public static void func(String str) {
		
		List<String> sal = new ArrayList<String>();
		
		Character ch;
		
		for(int i=0;i<str.length();i++) {
			
			ch = str.charAt(i);
			
			if(ch!=' ')
			
				sal.add(ch.toString());
			
		}
		
		
		System.out.println(sal);
	}

	
	public static void funcAnother(String str) {
		
		String [] sArr = str.split(" ");
		
		List<String> sal = Arrays.asList(sArr);
		
		System.out.println(sal);
			
	}
	
	public static void main(String[] args) {
		
		//List<String> sal = new ArrayList<String>(Arrays.asList("IAmYou"));
		
		func("I Am You");
		
		funcAnother("I Am You");

	}

}
