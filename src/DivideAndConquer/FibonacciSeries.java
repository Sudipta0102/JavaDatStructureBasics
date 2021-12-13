package DivideAndConquer;

public class FibonacciSeries {

	static int funcFib(int range) {

		if (range == 0) {

			return 0;

		}

		if (range == 1) {

			return 1;

		}

		return funcFib(range - 1) + funcFib(range - 2);

	}
	
	static int fibSum(int n) {
		if (n <= 1)
			return n;
		return fibSum(n - 1) + fibSum(n - 2) + 1;
	}

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++)

			System.out.print(funcFib(i) + " ");

		System.out.println();
		System.out.println();

		//System.out.println(fibSum(5, 0));
		
		System.out.println(fibSum(10));
	}
	

}
