package DynamicProg.tabulation;

import java.util.Arrays;

public class FIbTabulation {

	static void fibTab(int num) {

		int[] a = new int[num + 2];
		int n = a.length;
		a[1] = 1;

		for (int i = 0; i < n-2; i++) {

			if (i+1 < n) {
				a[i+1] = a[i] + a[i+1];
				a[i+2] = a[i] + a[i+2];
			}
		}

		System.out.println(a[num]);

	}

	public static void main(String[] args) {

		int n = 6;

		fibTab(n);

	}

}
