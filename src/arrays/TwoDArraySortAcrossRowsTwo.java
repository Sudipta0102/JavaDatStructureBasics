package arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class TwoDArraySortAcrossRowsTwo {
	
	public static void func(int[][] arr) {
		
		
		Vector<Integer> v = new Vector<>();
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {

				v.add(arr[i][j]);

			}

			Collections.sort(v);

			for (int j = 0; j < 4; j++) {

				arr[i][j] = v.get(j);
			}
		
		}

		System.out.println(v);
		
		System.out.println(Arrays.deepToString(arr));
		
		v.removeAllElements();
		
		System.out.println(v);
	}

	public static void main(String[] args) {

		int[][] arr = {{12, 10, 9, 15},
					  {23, 14, 11, 17},
					  {21, 11, 90, 19}};
		
		System.out.println(Arrays.deepToString(arr));
		
		System.out.println(arr.length);
		
		func(arr);

	}

}
