package arrayInterviewQuestions.Array50GFG.Level2;

import java.util.Arrays;

public class CyclicallyRotateByone {

	static void func(int[] a) {

		int n = a.length;
		int temp = a[0];
		int x = 0;

		for (int i = 0; i < n; i++) {

			if (i == 0)
				a[i] = a[n - 1];
			else {
				x = a[i];
				a[i] = temp;
				temp = x;
			}
		}

	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };
		
		int A[] = {9, 8, 7, 6, 4, 2, 1, 3};

		func(A);
		
		System.out.println(Arrays.toString(A));
	}

}
