package recursion;

import java.util.ArrayList;


public class FirstAndLastOcuranceofAnElement {

	//I am not able to do that without taking the result argument
	//In this function, every occurrence index prints. 
	static ArrayList<Integer> func(String s,char target, int i) {
		ArrayList<Integer> l = new ArrayList<>();
		if(s.isEmpty()) {			
			return l;
		}
		
		if(s.charAt(0)==target) {					
			l.add(i);							
		}
		
		ArrayList<Integer> listFromEveryCalls = func(s.substring(1), target, i+1);
		l.addAll(listFromEveryCalls);
		
		return l;
	}
	
	static ArrayList<Integer> func1(String s,char target, int i, ArrayList<Integer> res) {
		
		if(s.isEmpty()) {			
			return res;
		}
		
		if(s.charAt(0)==target) {					
			if(res.get(0)==-1) {
				res.set(0, i);		
			}
			else {
				res.set(1, i);
			}
		}
		
		return func1(s.substring(1), target, i+1, res);
	}
	
	static ArrayList<Integer> funcIterative(String s, char target){		
		ArrayList<Integer> res = new ArrayList<Integer>();	
		res.add(-1);
		res.add(-1);
		
		for(int i=0;i<s.length();i++) {			
			if(s.charAt(i)==target && res.get(0)==-1) {				
				res.set(0,i);				
			}		
			if(s.charAt(i)==target) {
				res.set(1, i);
			}		
		}		
		return res;
	}
	
	public static void main(String[] args) {
		
		String s = "abcaa";
		char target = 'a';
		
		//System.out.println(func(s, target, 0));
		//System.out.println(funcIterative(s, target));
		ArrayList<Integer> result = new ArrayList<>();
		result.add(-1);
		result.add(-1);
		System.out.println(func1(s, target, 0, result));
		
		
	}
	
}
