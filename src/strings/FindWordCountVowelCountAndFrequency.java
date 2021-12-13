package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FindWordCountVowelCountAndFrequency {
	
	public static void func(String str) {
		
		String[] sArr = str.split(" ");
		
		//word count
		System.out.println("Word count: "+ sArr.length);
		
		int vCount = 0;
		
		for(int i=0;i<str.length();i++) {
			
			char ch = str.toLowerCase().charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				
				vCount++;
				
			}
			
			
		}
		
		//vowel count
		System.out.println("Vowel count: "+ vCount);
		
		Map<Character,Integer> tm = new TreeMap<>();
		
		for(int i=0;i<str.length();i++) {
			
			if(tm.containsKey(str.charAt(i))) {
				
				tm.put(str.charAt(i), tm.get(str.charAt(i))+1);
						
			}
			else
				
				tm.put(str.charAt(i), 1);
			
		}
		
		//System.out.println(tm);
		
		for(Map.Entry<Character, Integer> m: tm.entrySet()) {
			
			System.out.println(m.getKey() + " : " + m.getValue());
			
		}
	}

	public static void main(String[] args) {

		func("I am You");

	}

}
