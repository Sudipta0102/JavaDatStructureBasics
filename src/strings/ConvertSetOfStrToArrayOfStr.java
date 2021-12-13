package strings;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConvertSetOfStrToArrayOfStr {
	
	//1. this is what i'd do
	public static void func(Set<String> ss) {
		
		String[] sArr = new String[ss.size()];
		
		int i=0;
		
		for(String str:ss) {
			
			sArr[i++] = str;
			//i++;
			
		}
		
		System.out.println(Arrays.toString(sArr));
		
	}
	
	//2. using Set.toArray method
	public static void funcAnother(Set<String> ss) {
		
		//Convert the Set of String to Array of String by passing empty array.
		//JVM will allocate the required space.
		String[] sArr = ss.toArray(new String[0]);
		
		System.out.println(Arrays.toString(sArr));
		
	}
	
	
	//3. using Arrays.copyOf() method
	public static void funcThird(Set<String> ss) {
		
		Object[] oArr = ss.toArray();
		
		
		String[] sArr = Arrays.copyOf(oArr, oArr.length, String[].class);
		
		System.out.println(Arrays.toString(sArr));
		
	}
	
	//4. Using System.arrayCopy method
	public static void funcFourth(Set<String> ss) {
		
		Object[] oArr = ss.toArray();
		
		String[] sArr = new String[oArr.length];
		
		System.arraycopy(oArr, 0, sArr, 0, oArr.length);
	    /*Arguments
	     * 1. Source Array
	     * 2. starting pos of source array
	     * 3. dest array
	     * 4. starting pos of dest array
	     * 5. number of ele,emts to be copied
		
		*/
		System.out.println(Arrays.toString(sArr));
				
	}

	public static void main(String[] args) {

		Set<String> ss = new HashSet<String>(Arrays.asList("I","am","you"));

		func(ss);
		
		funcAnother(ss);
		
		funcThird(ss);
		
		funcFourth(ss);
	}

}
