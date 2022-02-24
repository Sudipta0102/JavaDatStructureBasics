package strings;

import java.util.Arrays;



public class SwapCornerReverseMiddle {

	static String func(String s) {
		
		String[] sArr = s.split("\\W");
		String res = "";
		
		System.out.println(Arrays.toString(sArr));
		
		//swapping 1st and last element
		String temp = sArr[0];
		sArr[0] = sArr[sArr.length-1];
		sArr[sArr.length-1] = temp;
		
		// swapping the rest if there is any left which is if length is greater than 2
		if(s.length()>2) {
			for(int i=1;i<sArr.length-1;i++) {
				sArr[i] = reverseString(sArr[i]);
			}
		}
		
		for(String str: sArr) {
			res += str + " ";
		}
		
		return res.substring(0, res.length()-1);
	}
	
	static String reverseString(String s) {
		
		String rev = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			rev += s.charAt(i);
		}
		
		return rev;
	}
	
	
	public static void main(String[] args) {
		
		String input =  "Hello this is the GFG user";
			// Output: "user GFG eth si siht Hello"
		System.out.println(func(input));
		
		String str = "Hello bye";
		
		System.out.println(func(str));
	}
}
