package Collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetSpecialMethods {
	
	public static void func() {
		
	}

	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet<Integer>(Set.of(45, 12, 50, 23, 34));
		
		System.out.println(ts);
		
		System.out.println(ts.floor(30));
		
		System.out.println(ts.lower(23));
		
		System.out.println(ts);

	}

}
