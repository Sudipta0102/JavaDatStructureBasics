package Collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class IterateHashtable {
	
	//1. Using Enumeration
	public static void funcEnmeration(Hashtable<Integer, String> ht) {
		
		Enumeration<Integer> e = ht.keys();
		
		while(e.hasMoreElements()) {
			
			int key = e.nextElement();
			
			System.out.println(key+" : "+ht.get(key));
			
		}
		
	}
	
	//2. Using keySet()
	public static void funcKeySet(Hashtable<Integer, String> ht) {
		
		Set<Integer> setOfKeys = ht.keySet();
		
		for(int i: setOfKeys) {
			
			System.out.println(i+" : "+ht.get(i));
		}
		
	}

	//3. Using keySet() and Iterator interface
	public static void funcIterator(Hashtable<Integer, String> ht) {
		
		Set<Integer> setOfKeys = ht.keySet();
		
		Iterator<Integer> it = setOfKeys.iterator();
		
		while(it.hasNext()) {
			
			int key = it.next();
			
			System.out.println(key+" : "+ht.get(key));
		}
		
	}
	
	//4. entrySet() and enhanced for loop
	public static void funcEntrySet(Hashtable<Integer, String> ht) {
		
		Set<Entry<Integer, String>> entrySet = ht.entrySet();
		
		for(Entry<Integer, String> entry: entrySet) {
			
			System.out.println(entry.getKey() + " : " +entry.getValue());
			
		}
		
	}
	
	//5. entrySet() and Iterator
	public static void funcEntrySetIterator(Hashtable<Integer, String> ht) {
		
		Set<Entry<Integer, String>> entrySet = ht.entrySet();
		
		Iterator<Entry<Integer, String>> it = entrySet.iterator();
		
		while(it.hasNext()) {
			
			Entry<Integer, String> entry = it.next();
			
			System.out.println(entry.getKey()+" : "+entry.getValue());
			
		}
		
	}
	
	public static void main(String[] args) {

		Hashtable<Integer, String> ht = new Hashtable<>();
		
		ht.put(1, "I");
		ht.put(2, "Am");
		ht.put(3, "You");

		funcEntrySetIterator(ht);
		
	}

}
