package recursion;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Observer;

public class SubsequencesOfAString {

	static void findSubsequences(String processed, String unprocessed){
		
		if(unprocessed.isEmpty()) {
			
			System.out.println(processed);
			return;
			
		}
		
		char ch = unprocessed.charAt(0);
		
		findSubsequences(processed+ch, unprocessed.substring(1));
		findSubsequences(processed, unprocessed.substring(1));		
	}
	
	static ArrayList<String> findSubsequencesAgain(String p, String up){
		
		ArrayList<String> l = new ArrayList<String>();
		
		if(up.isEmpty()) {			
			l.add(p);
			System.out.println(l);
			return l;
		}
		
		char ch = up.charAt(0);
		
		ArrayList<String> left = findSubsequencesAgain(p+ch, up.substring(1));		
		ArrayList<String> right = findSubsequencesAgain(p, up.substring(1));
		left.addAll(right);
		//right.addAll(left);
		
		return left;
	}
		
	
	
	public static void main(String[] args) {
		
		String s = "abc";
		
		System.out.println(findSubsequencesAgain("", s));
		
	
		
	}
	

}
