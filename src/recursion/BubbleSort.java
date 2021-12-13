package recursion;

import java.util.Arrays;

public class BubbleSort {

	static int[] func(int[] a, int i, int j) {

		if (i == 0) {
			return a;
		}
		if (j<i) {
			if (a[j] > a[j + 1]) {

				int temp = a[j];
				a[j] = a[j + 1];
				a[j + 1] = temp;

			}

			return func(a, i, j + 1);
		}else {
			return func(a, i-1, 0);
			
		}
		
	}

	public static void main(String[] args) {

		int[] a = { 5,3, 4, 3, 2, 1 };

		System.out.println(Arrays.toString(a));
		
		System.out.println(Arrays.toString(func(a, a.length - 1, 0)));
	}
}
