package strings;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfWords {
	
	public static void func(String str) {
		
		Map<String, Integer> m = new HashMap<>();
		String[] sArr = str.split("\\W");
		
		//int n= str.length()-1;
		
		for(String s: sArr) {
			
			if(m.containsKey(s)) {
				
				m.put(s, m.get(s)+1);
			}
			else {
				
				m.put(s, 1);
			}
		}
		
		for(Map.Entry<String, Integer> entry : m.entrySet()) {
			
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		
	}

	public static void main(String[] args) {
		
		func("this is this is the shit");
		

	}

}
