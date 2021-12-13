package recursion.recursionPracticeSet7;

public class Example1 {
	
	static void func(int n) {
		
		if(n>0) {
			
			func(n-1);
			System.out.print(n+" ");
			func(n-1);
			
		}
		
	}

	public static void main(String[] args) {

		func(4);

	}

}
