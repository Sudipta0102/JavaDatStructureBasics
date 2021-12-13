package arrays;

import java.util.Arrays;
import java.util.LinkedList;

public class ConvertLinkedListToArray {
	
	public static void func(LinkedList<Integer> l) {
		
		Object[] objArr = l.toArray();
		
		Integer[] iArr = Arrays.copyOfRange(objArr, 0, objArr.length, Integer[].class);

		System.out.println(Arrays.toString(iArr));
		
	}
	
Without library I need to do this...	

	public static void main(String[] args) {
		
		
		LinkedList<Integer> ll = new LinkedList<>();
		
		ll.add(1);
		ll.add(2);
		
		func(ll);
		

	}

}
