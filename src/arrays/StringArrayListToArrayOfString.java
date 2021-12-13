package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class StringArrayListToArrayOfString {
	
	public static void func(ArrayList<String> a) {
		
		Object[] objArr = a.toArray();
		
		String[] strArr = Arrays.copyOfRange(objArr, 0, objArr.length, String[].class);
		
		System.out.println(Arrays.toString(strArr));
		
	}
	
	//iterative
	public static void funcIterative(ArrayList<String> l) {
		
		String[] strArr = new String[l.size()];
		int i = 0;
		
		for(String s: l) {
			
			strArr[i] = s;
			i++;
			
		}
		
		System.out.println(Arrays.toString(strArr));
		
	}

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		
		al.add("I");
		al.add("you");

		funcIterative(al);
		
	}

}
