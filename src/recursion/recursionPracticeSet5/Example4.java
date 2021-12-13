package recursion.recursionPracticeSet5;

//i do not understand this...

public class Example4 {

	static int func(int n) {
		
		if(n==1) {
			
			return 1;
			
		}
		
		return func(func(n-1));
		
	}
	
	static void funcAnother(int n) {
		
		if(n==0) {
			
			return;
		}
		
		funcAnother(n-1);
		funcAnother(n-1);
		System.out.print(n + " ");
	}
	
	public static void main(String[] args) {

		//System.out.println(func(5));
		
		funcAnother(5);
		
	}

}
