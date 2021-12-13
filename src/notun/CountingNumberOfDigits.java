package notun;

public class CountingNumberOfDigits {
	
	public static void func(int num) {
		
		int l = (int)Math.floor(Math.log10(num)) +1;
		
		System.out.println(l);
		
	}
	
	public static void funcNormal(int num) {
		
		int x=0;
		
		while(num>0) {
			if(num%10>=1) {
			x = x+1;
			}
			num = num/10;
		}
		
		System.out.println(x);
		
	}

	public static void main(String[] args) {
		
		
		func(786667);
		
		funcNormal(123);

	}

}
