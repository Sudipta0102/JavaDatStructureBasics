package Collections;

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapHashTableSynchronizedMap {
	
	public static void func() {
		
		
		
	}

	public static void main(String[] args) {

		ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap<>();
		
		chm.put(1, "C");
		chm.put(1, "A");
		chm.put(2, "B");
		
		chm.putIfAbsent(3, "D");
		chm.putIfAbsent(2, "E");
		
		chm.remove(2);
		
		chm.replace(1, "F");
		
		chm.replace(4, "G");
		
		System.out.println(chm);
		
		
		Hashtable<Integer, String> ht = new Hashtable<>();
		
		ht.put(null, null);
		ht.put(56, "G");
		ht.put(57, "Z");
		
		System.out.println(ht);

	}

}
www.geeksforgeeks.org/difference-between-concurrenthashmap-hashtable-and-synchronized-map-in-java/