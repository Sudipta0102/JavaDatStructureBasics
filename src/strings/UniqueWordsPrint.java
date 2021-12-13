package strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueWordsPrint {
	
	// this is o[n2]
	public static void func(String s) {
		
		String[] sArr = s.split("\\W");
		
		int n = sArr.length;
		int count;
		
		for(int i=0;i<n;i++) {
			count = 1;
			for(int j=i+1;j<n;j++){
				if(sArr[i].equalsIgnoreCase(sArr[j])) {
					count++;
					
					//this will empty the second occurrence
					sArr[j] = "";
				}	
				
			}
			
			if(count==1 && sArr[i]!="") {
				
				System.out.println(sArr[i]);
				
			}
			
		}
	}

	// i think this is o[n]
	public static void func1(String s) {
		
		String[] sArr = s.split("\\W");
		
		HashMap<String, Integer> sm = new LinkedHashMap<String, Integer>();
		
		for(String str: sArr) {
			
			if(sm.containsKey(str)) {
				
				sm.put(str, sm.get(str)+1);
			}
			else
				
				sm.put(str, 1);
		}
		
		//iterate over the map using for loop
		for(Map.Entry<String, Integer> entry: sm.entrySet()){
			
			if(entry.getValue() == 1) {
				
				System.out.println(entry.getKey());
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		func("i i i i am i you you i ");
		
		System.out.println("------");
		
		func1("i i i i am i you you i ");

	}

}
