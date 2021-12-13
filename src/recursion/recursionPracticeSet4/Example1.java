package recursion.recursionPracticeSet4;

public class Example1 {

	static void func(int x) {
		
		if(x>0) {
			
			func(--x);
			System.out.println(x+" ");
			func(--x);
		}
		
	}
	
	public static void main(String[] args) {
		
		func(4);
		
	}
	
}
