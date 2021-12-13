package recursion.recursionPracticeSet6;

public class Example1 {

	static void func(String s) {
		
		if(s.length()==0) {
			return;
		}
		
		func(s.substring(1));

		System.out.print(s.charAt(0));
	}
	
	public static void main(String[] args) {
		
		func("xyz");

	}

}
