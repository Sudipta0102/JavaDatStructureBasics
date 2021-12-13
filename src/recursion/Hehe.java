package recursion;

public class Hehe {

	static void func(int n) {
		
		if(n==0) {
			
			return;
			
		}
		
		func(n-1);
		System.out.println(n);
	}
	
	static int func1(int n) {
		
		if(n==0) {
			
			return 0;
			
		}
		
		return n + func1(n-1);
	}
	
	static int fact(int n) {
		
		if(n==1 || n==0) {
			
			return 1;
			
		}
		
		int f = fact(n-1);
		int fs = f * n;
		
		return fs;
		//return fact(n-1)*n;
	}
	
	static void fib(int n, int a, int b, int sum) {
		
		//base case
		if(n==0) return;
		
		int c = a+b;
		//sum+=c;
		System.out.print(c+" ");
		
		fib(n-1,b,c,sum);
		
		
	}
	
	static int fibA(int n) {
		
		if(n==0) {
			
			return 0;
		}
		if(n==1) {
			
			return 1;
		}
		
		int n1 = fibA(n-1);
		int n2 = fibA(n-2);
		int fib = n1 + n2;
		
		return fib;
	}
	
	static void fibSum(int n ) {
		
		if(n==0) return ;
		if(n==1) return ;
		
		/*
		 * what i know : 
		 * 1. 0 1 1 2 3 5 8 13 21....n
		 * 
		 */
		 
	}
	
	static int powerGame(int pow, int num) {
		
		if(pow==0) {
			return 1;
		}
		
		if(num==0) {
			
			return 0;
			
		}
		
		//num = num*powerGame(pow-1, num);
		int pg = powerGame(pow-1, num);
		num = num*pg;
		
		return num;
		
		
		//return num;
	}
	
	public static void strRev(String str, int len) {
		
		if(len<0) {
			
			return ;
		}
		
		char c = str.charAt(len);
		System.out.print(c);
		
		strRev(str, len-1);
		
	}
	

	
	public static void main(String[] args) {
		
		func(5);
		//System.out.println(func1(5));
		//System.out.println(fact(5));
		/*
		int a = 0, b=1, n=5;
		
		System.out.print(a+ " ");
		System.out.print(b+ " ");
		
		fib(n-2,a,b);
		*/
		/*
		for(int i=0;i<10;i++)
			System.out.print(fibA(i)+" ");
		
		System.out.println();
		*/
		//System.out.println(fibSum(5));
		
		//System.out.println(powerGame(4, 2));
		
		String str = "abcd";
		
		strRev(str, str.length()-1);
	}
	
}
