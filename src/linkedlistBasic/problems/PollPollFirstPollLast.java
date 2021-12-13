package linkedlistBasic.problems;

import java.util.LinkedList;

public class PollPollFirstPollLast {

	static void func() {
		
		LinkedList<String> l = new LinkedList<>();
		
		l.add("I");
		l.add("you");
		l.add(1,"am");
		
		System.out.println(l);
		
		
		//System.out.println(l.poll());
		/*
		System.out.println(l.poll());
		System.out.println(l.poll());
		System.out.println(l.poll());
		System.out.println(l.poll());
		*/
		/*
		System.out.println(l.pollFirst());
		System.out.println(l.pollLast());
		System.out.println(l.poll());
		System.out.println(l.poll());
		*/
		
		System.out.println(l.pollFirst());
		
		System.out.println(l);
		
		System.out.println(l.pollLast());
		
		System.out.println(l);
		
	}
	
	public static void main(String[] args) {
		
		func();
	}
	
}
