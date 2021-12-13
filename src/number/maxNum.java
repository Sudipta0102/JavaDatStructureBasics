package number;

public class maxNum {

	static int maxNumber(int a, int b, int c) {		
		if(a>=b && b>=c) {
			return a;
		}else if(b>=c) {
			return b;
		}else {
			return c;
		}		
	}
	
	public static void main(String[] args) {
		
		System.out.println(maxNumber(-5, 3, -5));
		
	}
}
