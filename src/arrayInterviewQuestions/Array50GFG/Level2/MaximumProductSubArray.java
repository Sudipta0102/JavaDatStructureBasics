package arrayInterviewQuestions.Array50GFG.Level2;

public class MaximumProductSubArray {

	static int max(int a, int b, int c) {

		int m =a;
		
		if(m<=b)
			m = b;
		if(m<=c)
			m = c;
		
		return m;
	}

	static int min(int a, int b, int c) {

		int m = a;
		
		if(m>=b)
			m = b;
		if(m>=c)
			m = c;
		
		return m;
		
	}
	
	static int arrayMax(int[] a) {
		
		int largest=a[0];
		int n = a.length;
		
		for(int i=0;i<n;i++) {
			
			if(largest<a[i]) {
				
				largest = a[i];
			}
			
		}
		
		return largest;
		
	}

	// 1. The trick here is, one needs to keep track of the minimum
	// product as well as the maximum product.
	// 2. Why? because, at any point if you have min product value
	// (i.e. -ve value) and the next value is also a -ve one, then
	// you get the largest product out of that (- * - = +)
	
	//this almost works...{-2,0,0,0,0,0,0} this array doesn't work;
	//{-9,0,-5}...this too won't work
	//but I am 100% stupid...
	static void func(int[] a) {

		int n = a.length;
		int maxNow = 1;
		int minNow = 1;
		int maxProduct = arrayMax(a);

		
		for (int i = 0; i < n; i++) {
			// {-6, 10, -3, 0, 2};

			if (a[i] == 0) {

				maxNow = 1;
				minNow = 1;
				// continue;
			} else {
				int temp = maxNow * a[i];
				maxNow = max(temp, a[i] * minNow, a[i]);
				minNow = min(temp, a[i] * minNow, a[i]);

				maxProduct = Math.max(maxProduct, maxNow);
			}
		}

		System.out.println(maxProduct);
	}

	// O(n^2)
	static void funcAgain(int[] a) {

		int n = a.length;
		int pro = 1;
		int max = 0;

		for (int i = 0; i < n - 1; i++) {

			pro = pro * a[i];

			for (int j = i + 1; j < n; j++) {
				pro = pro * a[j];
				max = Math.max(max, pro);
			}
		}

		System.out.println(max);

		// System.out.println(max);
	}

	public static void main(String[] args) {

		int Arr[] = { 6, 2, -10, 8, 2 };
		int[] a = { 6, -3, -10, 0, 2 };
		int[] b = { -6, 10, -3, 0, 2 };

		int[] d = {-2,0,0,0,0,0,0};
		int[] c = {-2,0,-1};

		func(d);

		System.out.println(max(42, -21, 7));
	}
}
