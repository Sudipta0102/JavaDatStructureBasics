package linkedlistBasic.problems;

import java.util.LinkedList;

public class JavaLinkedListIntro {

	static void func() {
		
		LinkedList<String> l = new LinkedList<String>();
		
		l.add("a");
		l.add("b");
		l.addFirst("A");
		l.addLast("z");
		l.add("c");
		l.add(0, "@");
		
		System.out.println(l);
		
		l.remove("a");
		l.remove(3);
		l.removeFirst();
		l.removeFirst();
		l.removeLast();
		l.removeLast();
		l.remove("H");
		
		
		System.out.println(l);
		
	}
	
	static void funcAnother() {
		
		LinkedList<String> l = new LinkedList<String>();
		
		l.add("I");
		l.add("you");
		l.add(1,"am");
		
		System.out.println(l);
	}

	//changing elements
	static void funcAnotherOne() {
		
		LinkedList<String> l = new LinkedList<>();
		
		l.add("I");
		l.add("you");
		l.add(1,"am");
		
		System.out.println(l);
		
		//that doesn't change the the value
		l.add(2,"I");
		
		System.out.println(l);
		
		//but this does
		l.set(2, "not");
		
		System.out.println(l);
	}
	
	//iterating linkedlist
	static void funcLast() {
		
		LinkedList<String> l = new LinkedList<>();
		
		l.add("I");
		l.add("you");
		l.add(1,"am");
		
		for(String s:l) {
			
			System.out.print(s + " ");
			
		}
		
		System.out.println();
		
		l.add(2, "not");
		
		for(int i=0;i<l.size();i++) {
			
			System.out.print(l.get(i)+ " ");
			
		}
	}
	
	static void oneMore() {
		
		LinkedList<String> l = new LinkedList<>();
		
		l.add("I");
		l.add("you");
		l.add(1,"am");
		
		
		Object[] oArr = l.toArray();
		
		String[] sArr = l.toArray(new String[0]);
		
		

	
	}
	
	public static void main(String[] args) {
	
		funcLast();
		
	}
	
}
