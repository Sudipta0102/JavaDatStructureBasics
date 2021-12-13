package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayIntoCollection {
	// this does not work for an integer array.
	public static void func(int[] a) {
		
		List al = Arrays.asList(a);
	
		 //List playersList = Arrays.asList(a);
		
		
		System.out.println(al);
	}
	
	 public static void funcB()
	    {
	        // array input
	        String playersArray[]
	            = { "Virat", "Sachin", "Rohit", "Bumrah" };
	        
	        // printing input elements for comparision
	        System.out.println("Array input: "
	                           + Arrays.toString(playersArray));
	        
	        // converting array into Collection
	        // with asList() function
	        List playersList = Arrays.asList(playersArray);
	        
	        // print converted elements
	        System.out.println("Converted elements: "
	                           + playersList);
	    }
	

	public static void main(String[] args) {

		int[] b = {4,8,5,3,0,7,6,2,1};
		
		String[] bs = {"i", "you", "them"};
		
		func(b);
		
		funcB();

	}

}
