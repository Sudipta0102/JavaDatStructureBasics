package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class FindIntersection {
	
	public static void func(ArrayList<Integer> a, ArrayList<Integer> b) {
		
		//Collections.sort(a);
		//Collections.sort(b);
		
		for(int i=0;i<a.size();i++) {
			
			if(!b.contains(a.get(i))) {
				
				a.remove(i);
				
			}
			
		}
		
		System.out.println(a);

		System.out.println(b);
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		ArrayList<Integer> bl = new ArrayList<>();		
		
		al.add(5);
		al.add(2);
		al.add(4);
		al.add(3);
		al.add(5);
		
		bl.add(3);
		bl.add(1);
		bl.add(2);
		bl.add(5);
		bl.add(2);
		
		func(al, bl);
	}

}
