package Collections.collectionsSortDateItemObjectsArraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDateTypeArraylistObects {

	public static void main(String[] args) {

		List<DateItem> dl = new ArrayList<DateItem>();
		
		dl.add(new DateItem("2020-03-25"));
	    dl.add(new DateItem("2019-01-27"));
	    dl.add(new DateItem("1998-01-27"));
	    dl.add(new DateItem("1998-02-26"));
		
	    //System.out.println(dl);
	    
	    System.out.println("Before Sorting: ");
	    for(DateItem d: dl) {
	    	
	    	System.out.println(d.getDate());
	    	
	    }
	    
	    
	    Collections.sort(dl, new SortItems());
	    
	    System.out.println("After Sorting: ");
	    for(DateItem d: dl) {
	    	
	    	System.out.println(d.getDate());
	    	
	    }
	}

}
