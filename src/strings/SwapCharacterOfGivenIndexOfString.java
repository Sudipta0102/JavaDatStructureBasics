package strings;

import java.util.Arrays;

public class SwapCharacterOfGivenIndexOfString {
	
	//O(n)
	public static void func(String str, int i, int j) {
		
		if(i>str.length()||j>str.length()||i==j) {
			
			System.out.println("Invalid Index");
			return;
			
		}
		
		char ch1 = str.charAt(i);
		char ch2 = str.charAt(j);
		
		char tempChar = ch1;
		ch1 = ch2;
		ch2 = tempChar;
		
		String res = "";
		
		for(int k=0;k<str.length();k++) {
			
			if(k==i) {
				res = res + ch1;
			}
			else if(k==j) {
				
				res = res + ch2;
			}
			else {
				res = res + str.charAt(k);
			}
			
		}
		
		System.out.println(res);
		
	}

	//O(1)
	public static char[] funcAnother(String str, int i, int j) {
		
		char[] cArr = str.toCharArray();
		
		char tempChar = cArr[i];
		cArr[i] = cArr[j];
		cArr[j] = tempChar;
		
		return cArr;
		
	}
	
	public static void main(String[] args) {


		func("iamyou", 1,2);
		
		System.out.println(funcAnother("iamyou", 1, 2));

	}

}
