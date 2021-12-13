package arrays;

import java.util.Arrays;

public class AnonymousArray {
	
	/*
	 * 1.An array in Java without any name is anonymous array. 
	 * 
	 * 2.It is an array just for creating and using instantly.
	 * 
	 * 3. We can create an array without name, 
	 * such type of nameless arrays are called anonymous array.
	 * 
	 * 4. The main purpose of anonymous array is just for 
	 * instant use (just for one time usage).
	 * 
	 * 5. Anonymous array is passed as an argument of method
	 */
	
	public static int[]  func() {
		
		return(new int[] {1,2,3});
		
	}

	public static void main(String[] args) {

		System.out.println(Arrays.toString(func()));
		

	}

}
