package recursion;

import java.sql.Array;
import java.util.ArrayList;

//this difference of approach is kinda important when it comes 
//to recursion 
public class DuplicateIndexesIntoArrayList {

	//Taking the result arraylist as an argument
	static ArrayList<Integer> func(int[] a, int target, int idx, ArrayList<Integer> l){
		
		if(idx>=a.length)
			return l;
		
		if(a[idx] == target)
			l.add(idx);
		
		return func(a, target, idx+1, l);
		
	}
	
	//Taking a result arraylist in the body 
	static ArrayList<Integer> funcAgain(int[] a, int target, int idx){
		
		ArrayList<Integer> indices = new ArrayList<Integer>();
		//indices.addAll(indices);
		if(idx>=a.length) {
			return indices;
			//return l;
		}
				
		if(a[idx]==target)
			indices.add(idx);
		
		ArrayList<Integer> listFromEveryCalls =  funcAgain(a, target, idx+1);
		
		if(!listFromEveryCalls.isEmpty())
			indices.addAll(listFromEveryCalls);
		
		return indices;
	}
	
	public static void main(String[] args) {
		int a[] = {1,2,3,2,3,2,2};
		ArrayList<Integer> l = new ArrayList<>();
		int target = 2;
		
		//System.out.println(func(a, target, 0, l));
		System.out.println(funcAgain(a, target, 0));
	}
}
