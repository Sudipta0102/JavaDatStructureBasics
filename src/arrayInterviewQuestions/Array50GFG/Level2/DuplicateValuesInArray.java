package arrayInterviewQuestions.Array50GFG.Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateValuesInArray {

	// the two pointer works here too as did in missing number
	// and counting pair of given sum.
	// but, there is one problem.
	// if I get already occurred value. It still considers
	// that value. For example, in case of 2 that i returned as
	// already occurred value, it still considers the later value.
	// solution:
	// 1. make the later elements to Integer.MIN value.
	// 2. take a arrayList and keeps a check that if it
	// contains that value, then it's an already occurred value
	// so that check can be skipped.
	static void func(int[] a) {
		// {2,1,3,1,2,2,3,3,3,1,3};
		int n = a.length;
		int start = 0;
		List<Integer> l = new ArrayList<>();

		System.out.println("The value occured more than once are:");

		for (int i = 1; i < n; i++) {

			//1. if list contains the value, i have already 
			//returned this value as repeated value
			//2. or if one value does not occur more than once.
			if (l.contains(a[start]) || (start!=n-1 && i==n-1)) {

				start++;
				i = start;

			} else {

				if (a[start] == a[i]) {

					// System.out.print(a[start]+" ");
					l.add(a[start]);
					start++;
					i = start;

					System.out.println(l);
				}
			}
		}
		

		System.out.println(l);
	}
	
	//also there is one more solution which has to do with hashmap
	//this will also be O(n) time and O(n) space solution. 

	public static void main(String[] args) {

		int a[] = { 2, 1, 3, 1, -2, -2, 3};
		int b[] = {2, -1, -1, 2, 2};

		System.out.println(Arrays.toString(a));
		
		func(a);
		
		

	}
}
