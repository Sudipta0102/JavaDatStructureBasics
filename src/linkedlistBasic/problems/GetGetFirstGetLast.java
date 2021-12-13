package linkedlistBasic.problems;

import java.util.LinkedList;

public class GetGetFirstGetLast {

	static void func() {
		
		LinkedList<String> l = new LinkedList<>();
		
		l.add("I");
		l.add("you");
		l.add(1,"am");
		
		//System.out.println(l.get(4));
		
		System.out.println(l.getFirst());
		
		System.out.println(l.get(1));
		
		System.out.println(l.getLast());
		
		System.out.println(l.getClass().getName());
		
		System.out.println(l.getClass().getCanonicalName());
		
		System.out.println(l.getClass().getModifiers());
		
		System.out.println(l.getClass().getPackageName());
		
		System.out.println(l.getClass().getSimpleName());
		
		System.out.println(l.getClass().getTypeName());
		
		System.out.println(l.getClass().isAnnotation());
		
		System.out.println(l.getClass().getClass());
	}
	
	public static void main(String[] args) {
		
		func();
		
	}
}
