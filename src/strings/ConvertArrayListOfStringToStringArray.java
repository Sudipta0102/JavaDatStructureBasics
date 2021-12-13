package strings;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayListOfStringToStringArray {
	
	public static void func(ArrayList<String> sal ) {
		
		String[] sArr = new String[sal.size()];
		
		for(int i=0;i<sArr.length;i++) {
			
			sArr[i] = sal.get(i);
			
		}
		
		System.out.println(Arrays.toString(sArr));
		
	}
	
	public static void funcAnother(ArrayList<String> sal) {
		
		//use oject array as intermediate array
		Object[] oArr = sal.toArray();
		
		String[] sArr = new String[oArr.length];
		
		for(int i=0;i<oArr.length;i++) {
			
			//cast each element when inserting in String array
			sArr[i] = (String)oArr[i];
			
		}
		
		System.out.println(Arrays.toString(sArr));
	}

	public static void funcLast(ArrayList<String> sal) {
		
		Object[] oArr = sal.toArray();
		
		String [] sArr = Arrays.copyOf(oArr, oArr.length, String[].class);
		
		System.out.println(Arrays.toString(sArr));
	}
	
	
	
	public static void main(String[] args) {
		
		ArrayList<String> sal = new ArrayList<String>(Arrays.asList("I", "am", "you"));

		System.out.println(sal);
		
		func(sal);
		
		funcAnother(sal);
		
		funcLast(sal);
		
	}

}
