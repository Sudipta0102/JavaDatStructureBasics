package linkedlistBasic.problems;

import java.util.LinkedList;

public class OfferOfferFirstOfferLast {

	static void func() {
		
		LinkedList<String> l = new LinkedList<>();
		
		l.add("I");
		l.add("you");
		l.add(1,"am");
		
		System.out.println(l.offer("right"));
		
		System.out.println(l);
		
		System.out.println(l.offerFirst("to start with"));
		
		System.out.println(l);
		
		System.out.println(l.offerLast("or wrong"));
		
		System.out.println(l);
		
	}
	
	static void funcAnother() {
		
		LinkedList<String> l = new LinkedList<>();
		
		System.out.println(l.offer("I"));
	}
	
	public static void main(String[] args) {

		funcAnother();

	}

}
