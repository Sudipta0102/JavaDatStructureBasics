package strings;

import java.util.Arrays;

public class UnderscoreSeperatedStringToCamelCase {

	public static void func(String str) {
		
		String[] sArr = str.split("_");
		
		String res = "";
		
		System.out.println(Arrays.toString(sArr));
		
		for(int i=0;i<sArr.length;i++) {
			
			String temp = "";
			char ch;
			
			ch = Character.toUpperCase(sArr[i].charAt(0));
			
			for(int j=1;j<sArr[i].length();j++) {
			
				temp = temp + sArr[i].charAt(j);  
			
			}
			
			temp = ch + temp;
			res = res + temp;
			
		}
		
		System.out.println(res);
		
	}
	
	public static void funcAnother(String str) {
		
		
		
	}
	
	
	public static void main(String[] args) {


		func("i_am_you");
		
		//op: IAmYou
		
		funcAnother("i_am_you");

	}

}
