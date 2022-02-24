package strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PrintUniqueWords {

	static void func(String str) {
		
		String[] sArr = str.split("\\W");
		Map<String, Integer> m = new HashMap<String, Integer>();
		
		System.out.println(Arrays.toString(sArr));
		
		for(int i=0;i<sArr.length;i++) {
			
			if(m.containsKey(sArr[i])) {
				m.put(sArr[i], m.get(sArr[i])+1);
			}
			else {
				m.put(sArr[i], 1);
			}
		}
		
		for(String s: m.keySet()) {
			if(m.get(s)==1)
				System.out.println(s);
			
		}
		
		
	}
	
	public static void main(String[] args) {
	
		String str = "Welcome to Geeks for Geeks";
		
		func(str);
	}
	
	
	
}
