package recursion;

public class ReverseNum {

	//1st way: taking an extra argument
	static int func(int num, int res) {		
		if(num == 0) {		
			return res;		
		}
		//int res = 0;		
		res = res *10 + num%10;		
		return func(num/10, res);	
	}
	
	//2nd way: overloading the same function with an extra argument :D
	static int funcAgain(int num) {
		
		int res = 0;
		
		return funcAgain(num, res);
			
	}
	
	static int funcAgain(int num, int res) {
		
		if(num==0)
			return res;
		
		res = res*10 + num%10;
		
		return funcAgain(num/10, res);
		
	}
	
	static int funcLast(int num) {
		
		int digitCount = (int)(Math.log10(num)) + 1; 
		
		return helper(num, digitCount);
	}
	
	static int helper(int num, int digits) {
		
		if(num%10 == num)
			return num;
		
		int rem = num % 10;
		return rem*(int)(Math.pow(10, digits-1)) + helper(num/10, digits-1);
	}
	
	
	
	public static void main(String[] args) {
		int num = 12345;		
		//System.out.println(func(num, 0));
		
		//System.out.println(funcAgain(num));
		
		System.out.println(funcLast(num));
	}
	
}
