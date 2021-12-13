package BackTracking;

import java.util.ArrayList;

public class GridTravelerPathPrinting {

	static void func(String result, int m, int n){
		
		if(m==1 && n==1) {
			System.out.println(result);
			return;
		}
		if(m>1)
			func(result + 'D', m-1, n);
		if(n>1)
			func(result + 'R', m, n-1);
	}
	
	static ArrayList<String> func1(String result, int m, int n){
			
		if(m==1 && n==1) {
			ArrayList<String> l = new ArrayList<>();
			l.add(result);
			return l;
		}
		ArrayList<String> left = new ArrayList<>();
		ArrayList<String> right = new ArrayList<>();
		if(m>1)
			 left = func1(result + 'D', m-1, n);
		if(n>1)
			right = func1(result + 'R', m, n-1);
		
		left.addAll(right);
		
		return left;
	}
	
	public static void main(String[] args) {
		
		//func("", 3, 3);
		System.out.println(func1("", 3, 3));
	}
	
}
