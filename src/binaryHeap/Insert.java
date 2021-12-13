package binaryHeap;

import java.util.Arrays;

// i dunno about space complexity though...
//taking a whole another array, can work with a list also

public class Insert {

	static void func(int[] a, int len, int val) {

		
		int[] copy = new int[len + 1];

		//copying value in the new array 
		//whose length is one higher than
		//the main array
		for (int i = 0; i < len; i++) {

			copy[i] = a[i];

		}

		System.out.println(Arrays.toString(copy));

		int cLen = copy.length;

		//copying new value at the last
		copy[cLen - 1] = val;

		System.out.println(Arrays.toString(copy));

		int parent = 0;
		
		int i = cLen -1;
	
		while (i > 0) {

			
			//finding parent is based on cell number pattern
			//where odd cells in array are left child and 
			//even cells are right child.(assuming i starts from 0) 
			if(i%2!=0)
				parent = i / 2;
			else
				parent = i / 2 - 1;
			

			if (copy[i] > copy[parent]) {

				int temp = copy[parent];
				copy[parent] = copy[i];
				copy[i] = temp;

				i = parent;
			}

			else {

				break;
			}			
		}

		System.out.println(Arrays.toString(copy));
		
	}

	public static void main(String[] args) {

		int[] a = { 50, 45, 35, 33, 16, 25, 34, 12, 10 };

		int val = 47;

		int n = a.length;

		func(a, n, val);

	}

}
