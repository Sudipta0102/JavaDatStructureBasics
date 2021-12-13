package strings;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class FindUnioqueWordsOfString {
	
	public static void func(String str) {
		
		String[] sArr = str.split("\\s+");
	
		Set<String> hs = new HashSet<>();
		
		for(int i=0;i<sArr.length;i++) {
			
			hs.add(sArr[i]);
			
		}
		
		System.out.println(hs);
	}


	public static void main(String[] args) {


		func("I Am I You Am I too to");

	}

}
