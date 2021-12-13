package recursion.recursionPracticeSet5;

public class Example1 {
	
	static int func(int a, int b) {
		
		if(b==0) {
			
			return 0;
			
		}else if(b%2==0) {
			
			return func(a+a, b/2);
		}
		
		return func(a+a,b/2)+a;
	}

	public static void main(String[] args) {

		System.out.println(func(4, 2));

	}

}
