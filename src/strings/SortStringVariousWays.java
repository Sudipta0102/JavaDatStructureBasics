package strings;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringVariousWays {

	public static void func(String str) {
		
		char[] cArr = str.toCharArray();
		
		Arrays.sort(cArr);
		
		System.out.println(Arrays.toString(cArr));
		
		System.out.println(new String(cArr));
		
	}
	
	public static void funcAnother(String str) {
		
		Character[] cArr = new Character[str.length()];
		//Convert into a Character array 
		for(int i=0;i<cArr.length;i++) {
			
			cArr[i] = str.charAt(i);
			
		}
		
		
		System.out.println(Arrays.toString(cArr));
		
		//Sort ignoring case
		Arrays.sort(cArr, new Comparator<Character>() {

			@Override
			public int compare(Character c1, Character c2) {
				// TODO Auto-generated method stub
				return Character.compare(Character.toLowerCase(c1)
						, Character.toLowerCase(c2));
			}		
		});
		
		System.out.println(Arrays.toString(cArr));
		
		
		StringBuilder sb = new StringBuilder();
		for(Character c : cArr) {
			
			sb.append(c.charValue());
		}
		
		System.out.println(sb.toString());
	}
	
	public static void main(String[] args) {

		func("you");
		
		System.out.println("----------");
		
		funcAnother("you");
		

	}

}
