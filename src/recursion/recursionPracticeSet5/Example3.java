package recursion.recursionPracticeSet5;

public class Example3 {

	static int func(int a) {
		
		if(a==1) {
			
			return 1;
			
		}
			
			return func(a-1) * a;
	}
	
	public static void main(String[] args) {

		System.out.println(func(4));

	}

}
