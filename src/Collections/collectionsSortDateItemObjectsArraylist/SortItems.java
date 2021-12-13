package Collections.collectionsSortDateItemObjectsArraylist;

import java.util.Comparator;

public class SortItems implements Comparator<DateItem>{
	
	public int compare(DateItem a, DateItem b) {
		
		
		return a.getDate().compareTo(b.getDate());
		
		
	}

}
