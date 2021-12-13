package recursion;

public class PalindromeNumber {

	static boolean func(int num) {
		
		int res = rev(num, 0);		
		return num == res;
		
	}
	
	static int rev(int num, int res) {
		
		if(num==0)
			return res;
		
		res = res*10+num%10;
		
		return rev(num/10, res);
		
	}
	
	public static void main(String[] args) {
		
		int num = 123212;
		
		System.out.println(func(num));
		
	}
}
