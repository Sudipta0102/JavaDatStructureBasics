package recursion;

public class PrintFun {
	
	static void func(int n) {
		
		if(n<1) {
			return;
		}
		
		System.out.printf("%d ", n);
		func(n-1);
		System.out.printf("%d ", n);
		
	}

	public static void main(String[] args) {
		
		func(3);

	}

}
