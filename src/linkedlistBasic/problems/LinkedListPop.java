package linkedlistBasic.problems;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class LinkedListPop {

	static void func() {
		
		LinkedList<Integer> l = new LinkedList<>();
		
		//Stack<Integer> l1 = new LinkedList<Integer>();
		
		l.add(1);
		l.add(2);
		l.add(6);
		l.add(4);
		
		System.out.println(l);
		
		l.pop();
		
		System.out.println(l);
		
		
	}
	
	public static void main(String[] args) {
		
		func();
	}
	
	
}
