package strings.Strings50GFG.Level1;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

public class IntegerToRoman {

	static void func(int num) {
		
		int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] romanLiterals = {"M","CM","D","CD","C","XC","L",
				"XL","X","IX","V","IV","I"};
		
		/* Map isn't working because it's unordered
		Map<Integer, String> hm = new HashMap<>();
		
		hm.put(1000, "M");
		hm.put(900, "CM");
		hm.put(500, "D");
		hm.put(400, "CD");
		hm.put(100, "C");
		hm.put(90, "XC");
		hm.put(50, "L");
		hm.put(40, "XL");
		hm.put(10, "X");
		hm.put(9, "IX");
		hm.put(5, "V");
		hm.put(4, "IV");
		hm.put(1, "I");
		
		System.out.println(hm);
		*/
		StringBuilder sb = new StringBuilder("");

		for(int i=0;i<values.length;i++) {
			
			while(num>=values[i]) {
				
				sb.append(romanLiterals[i]);
				num = num - values[i];
				
				System.out.println(sb.toString());
			}
			
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		func(1994);
		
		StringBuilder sb = new StringBuilder("");
		
	}
	
}
