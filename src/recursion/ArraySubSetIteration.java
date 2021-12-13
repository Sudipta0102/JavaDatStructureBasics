package recursion;

import java.util.ArrayList;
import java.util.List;

public class ArraySubSetIteration {

	static ArrayList<ArrayList<Integer>> func(int[] a) {
		ArrayList<ArrayList<Integer>> outer = new ArrayList<ArrayList<Integer>>();
		outer.add(new ArrayList<>());
		//System.out.println(outer.size());
		//System.out.println(outer);
		
		
		for(int num:a) {
			int n = outer.size();
			for(int i=0;i<n;i++) {
				System.out.println(outer.get(i));
				ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
				System.out.println("Inner before add: "+inner);
				inner.add(num);
				if(!outer.contains(inner)) //this line is for arrays with duplicate elements
					outer.add(inner);
				System.out.println("Inner after add: "+inner);
				System.out.println("Outer: "+outer);				
			}
			
			System.out.println();
			
			
		}
		
		return outer;
	}
	public static void main(String[] args) {
		int[] a = {2,1,2};
		System.out.println(func(a));
	
		/*
		List<Integer> l1 = new ArrayList<>();
		
		l1.add(0);
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		
		//System.out.println(l1);
		
		List<Integer> l2 = new ArrayList<>(l1.set(0, 5));
		List<Integer> l3 = new ArrayList<>(l1.get(4));
		l3.add(10);
		
		//System.out.println(l2);
		System.out.println(l3);
		
		//System.out.println(l1);
		
		
		List<List<Integer>> outer = new ArrayList<List<Integer>>();
		
		outer.add(l2);
		outer.add(l3);
		outer.add(l1);
		
		System.out.println(outer);
		
		List<Integer> inner = new ArrayList<>(outer.get(1));
		
		System.out.println(inner);
		*/
		/*
		ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
		
		outer.add(new ArrayList<>());
		
		System.out.println(outer);
		
		ArrayList<Integer> inner = new ArrayList<>(outer.get(0));
		
		inner.add(1);
		
		outer.add(inner);
		
		System.out.println(outer);
		*/
	}
}
