package BackTracking;

import java.util.ArrayList;

public class GridTravelerIncludingTheDiagonalPaths {

	static ArrayList<String> func(String result, int m, int n){
		
		if(m==1 && n==1) {
			ArrayList<String> l = new ArrayList<>();
			l.add(result);
			return l;
		}
		
		ArrayList<String> l = new ArrayList<>();
		
		if(m>1 && n>1) {
			l.addAll(func(result+'D', m-1, n-1));
		}		
		if(m>1)
			l.addAll(func(result+'V', m-1, n));
		if(n>1)
			l.addAll(func(result+'H', m, n-1));
		
		
		return l;
	}
	
	public static void main(String[] args) {
		System.out.println(func("", 3, 3));
	}
}
