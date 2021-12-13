package strings;

import java.util.ArrayList;
import java.util.List;

public class ConvertArraylistToCommaSepString {
	
	public static void func(List<String> l) {
		
		String res = "";
		
		System.out.println(l.size());
		
		for(int i=0;i<l.size();i++) {
			
			res = res + l.get(i) + ", ";
			
		}
		
		System.out.println(res.substring(0, res.length()-2)); 
		
	}

	public static void main(String[] args) {
		
		
		List<String> l = new ArrayList<String>();
		
		l.add("abc");
		l.add("abc");
		l.add("abc");
		l.add("abc");
		
		func(l);
		
		
	
	
	}
	
	

}
