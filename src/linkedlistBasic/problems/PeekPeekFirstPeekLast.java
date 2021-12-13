package linkedlistBasic.problems;

import java.util.LinkedList;

public class PeekPeekFirstPeekLast {

	static void func() {
		
		LinkedList<String> l = new LinkedList<>();
		
		l.add("I");
		
		l.add("am");
		
		l.add("you");
		
		System.out.println(l);
		
		
		System.out.println(l.peek());
		System.out.println(l.peekFirst());
		
		System.out.println(l.peek());
		System.out.println(l.peekLast());
		
		
	}
	
	public static void main(String[] args) {
		
		func();
		
	}
	
}
