package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pangram {
	
	public static boolean func(String str) {
		
		Set<Character> hs = new HashSet<Character>();
		
		List<Character> al = new ArrayList<Character>();
		
		for(int i=0;i<str.length();i++) {
			
			al.add(str.toLowerCase().charAt(i));
		}
		
		//System.out.println(al);
		
		
		
		for(int i=0;i<al.size();i++) {
			
			hs.add(al.get(i));
		}
		
		
		//System.out.println(hs);
		
		if(hs.size()<26)
			return false;
		else
			return true;
	}
	
	
	public static boolean funcAnother(String str) {
		
		char[] cArr = str.toLowerCase().toCharArray();
		boolean[] bArr = new boolean[26];
		
		//System.out.println(bArr[0]);
		//System.out.println(bArr[25]);
		
		if(cArr.length<26) {
			
			System.out.println(str + " is less than 26 chars");
			return false;
		}
		//'a' = 97;
		//'z' = 122;
		for(int i=0;i<cArr.length;i++) {
				
			bArr[cArr[i]-97] = true;
	
		}
	
		for(int i=0;i<bArr.length;i++) {
			
			if(bArr[i]==false) {
				return false;
			}
			
		}
		
		
		return true;
	}

	public static void main(String[] args) {
		
		System.out.println(func("String"));
		System.out.println("========");
		
		System.out.println(func("Abcdefghijklmnopqrstuvwxyzalsl"));
		System.out.println("========");
		
		
		System.out.println(funcAnother("Abcdefghijklmnopqrstuvwxyzalsl"));
		System.out.println("========");
		
		System.out.println(funcAnother("String"));
	}

}
