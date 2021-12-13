package arrays;

import java.util.ArrayList;
import java.util.List;

public class AddElementInSpecificIndexInArray {

	public static void func(int[] a, int element, int idx) {
		
		List<Integer> al = new ArrayList<>();
		
		for(int i =0;i<a.length;i++) {
			
			al.add(a[i]);
		}
		
		System.out.println(al);
		
		al.add(idx-1, element);
		
		System.out.println(al);
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		
		int[] a = {41,32,53,14,65,26,87,68,79,40};
		
		func(a, 65, 3);

	}

}
