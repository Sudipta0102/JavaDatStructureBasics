package linkedlistBasic.problems;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
//import java.util.Map.Entry;

public class SortingHashMapValues {

	static HashMap<String, Integer> sortByValues(HashMap<String, Integer> hm) {
		
		List<Map.Entry<String, Integer>> list = 
				new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());
		
		
		//Sort the list using comparator
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return (o1.getValue()).compareTo(o2.getValue());
			}		
		});
		
		HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
		
		for(Map.Entry<String, Integer> aa:list) {
			
			temp.put(aa.getKey(), aa.getValue());
			
		}
		
		return temp;
	}
	
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		 
        // enter data into hashmap
        hm.put("Math", 98);
        hm.put("Data Structure", 85);
        hm.put("Database", 91);
        hm.put("Java", 95);
        hm.put("Operating System", 79);
        hm.put("Networking", 80);
        Map<String, Integer> hm1 = sortByValues(hm);
 
        // print the sorted hashmap
        for (Map.Entry<String, Integer> en : hm1.entrySet()) {
            System.out.println("Key = " + en.getKey() +
                          ", Value = " + en.getValue());
		
        }
	
	}
	
}