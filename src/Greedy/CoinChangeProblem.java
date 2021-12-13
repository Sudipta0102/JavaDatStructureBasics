package Greedy;

import recursion.PracticeConfidenceGain.reverseNumber;

public class CoinChangeProblem {

	static void func(int[] a, int val) {

		int n = a.length - 1;

		for (int i = n; i >= 0; i--) {

			int rem = 0;
			int mod = 0;

			if (val >= a[i]) {

				rem = val / a[i];
				mod = val % a[i];
				System.out.println(rem + "*" + a[i]);

				val = mod;
			}

			if (val == 0) {

				break;

			}

		}

	}

	public static int reverse(int x) {

		int y = 0, z = 0, res = 0;
		int count = 0;
		int factor = 1;

		z = Math.abs(x);
		y = Math.abs(x);

		// counting digit
		while (y > 0) {

			count++;
			y = y / 10;

		}

		if (x == 0 || (x > 0 && count > 9) || x < Integer.MIN_VALUE || x > Integer.MAX_VALUE) {

			return 0;

		}

		// System.out.println(count);

		// determining factor
		while (count > 1) {

			factor = factor * 10;
			count--;

		}

		// System.out.println(factor);

		// reversing here
		while (z > 0) {

			System.out.println(factor);
			int mod = z % 10;
			if (mod > 0)
				res = res + (z % 10) * factor;

			z = z / 10;
			factor = factor / 10;

		}

		if (x < 0) {

			res = res * -1;
		}

		// I could have used string here, could have been so much easier.
		return res;
	}

	public static boolean isPalindrome(int x) {
		int res = 0;
		int y = x;

		while (x > 0) {

			int mod = x % 10;

			if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && mod >= Integer.MAX_VALUE % 10))
				return false;

			res = res * 10 + mod;

		}

		if (res != y)
			return false;
		else
			return true;
	}

	public static void main(String[] args) {

		/*
		 * int[] a = {1,2,5,10,20,50,100,500,1000};
		 * 
		 * func(a, 2509);
		 * 
		 * 
		 * int x = -123;
		 * 
		 * System.out.println(Math.abs(x));
		 * 
		 * String s = "";
		 * 
		 * int i = 89;
		 * 
		 * s = s + i;
		 * 
		 * System.out.println(s);
		 * 
		 * int j = Integer.valueOf(s);
		 * 
		 * System.out.println(j);
		 */

		System.out.println(isPalindrome(121));
	}

}
