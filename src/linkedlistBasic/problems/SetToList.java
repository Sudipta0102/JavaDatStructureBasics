package linkedlistBasic.problems;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetToList {

	static void func() {
		
		List<Integer> l = new LinkedList<>();
		
		Set<Integer> s = new TreeSet<>();
		
		s.add(3);
		s.add(7);
		s.add(3);
		s.add(4);
		s.add(2);
		
		System.out.println(s);
		
		l.addAll(s);
		
		System.out.println(l);
				
	}
	
	public static void main(String[] args) {
		
		func();
	}
	
}
