package arrays;

import java.util.Arrays;
import java.util.Vector;

public class ConvertVectorToArray {
	
	public static <T> void func(Vector<T> vector) {
		
		Object[] objArr = vector.toArray();
		
		System.out.println(Arrays.toString(objArr));
		
		String[] strArr = Arrays.copyOfRange(objArr, 0, objArr.length, String[].class);
		
		System.out.println(Arrays.toString(strArr));
		
	}
	
	public static <T> void funcAnother(Vector<T> vector) {
		
		String[] strArr = vector.toArray(new String[vector.size()]);
		
		System.out.println(Arrays.toString(strArr));
		
		
	}
	

	public static void main(String[] args) {

		Vector<String> vector = new Vector<String>();

		// Adding elements to the linked list
		vector.add("G");
		vector.add("e");
		vector.add("e");
		vector.add("k");
		vector.add("s");	
		
		funcAnother(vector);

	}

}
