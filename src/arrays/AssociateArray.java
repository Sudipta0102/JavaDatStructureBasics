package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AssociateArray {
	
	public static void func() {
		
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		hm.put(0, 20);
		hm.put(1, 50);
		hm.put(2, 10);
		hm.put(3, 60);
		hm.put(4, 30);
		
		Set<Map.Entry<Integer, Integer>> set = hm.entrySet();
		
		List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(set);
		
		for(int i=0;i<list.size();i++) {
			
			System.out.println(list.get(i).getKey()+" : "+list.get(i).getValue());
			
			
		}
		
	}
	
	public static void funcAnother() {
		
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		hm.put(0, 20);
		hm.put(1, 50);
		hm.put(2, 10);
		hm.put(3, 60);
		hm.put(4, 30);
		
		Set<Map.Entry<Integer, Integer>> set = hm.entrySet();
		
		List<Map.Entry<Integer, Integer>> list = new ArrayList<>(set);
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
			
		}
		
		
	}

	public static void main(String[] args) {


		func();
		
		System.out.println();
		
		funcAnother();
	}

}
