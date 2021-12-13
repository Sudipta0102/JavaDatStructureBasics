package linkedlistBasic.problems;

import java.util.LinkedList;

public class IndexOfLastIndexOf {

	static void func() {

		LinkedList<String> l = new LinkedList<>();
		
		l.add("I");
		l.add("you");
		l.add(1,"am");
		l.add("am");
		
		
		System.out.println(l);
		
		System.out.println(l.indexOf("am"));
		
		System.out.println(l.indexOf("amfg"));
		
		System.out.println(l.lastIndexOf("am"));
		
	}
	
	public static void main(String[] args) {
		
		func();
		
	}
}
