package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReflectArrayVsUtilArrays {

	public static void main(String[] args) {

		int[] a = {1,2,3,4,5};
		
		System.out.println(Array.getInt(a, 0));
		
		Array.set(a, 0, 4);
		
		System.out.println(Arrays.toString(a));

	}

}
