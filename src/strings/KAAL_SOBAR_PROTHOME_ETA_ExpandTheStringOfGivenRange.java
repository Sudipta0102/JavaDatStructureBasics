package strings;

import java.util.Arrays;

eta Kortei hobe

public class KAAL_SOBAR_PROTHOME_ETA_ExpandTheStringOfGivenRange {

	public static void func(String str) {
		
		String[] sArr = str.split(", ");
		
		
		
		
		System.out.println(Arrays.toString(sArr));
		
		System.out.println(Integer.parseInt(String.valueOf(str.charAt(str.length()-1))));
		
//		for every string element
//		if 
//		string contains hyphen
//		
		
	}
	
	public static void main(String[] args) {

		func("1-5, 8, 11-14, 18, 20, 26-29");

	}

}
