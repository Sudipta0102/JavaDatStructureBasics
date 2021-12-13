package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.sun.tools.javac.util.ArrayUtils;

import spals.shaded.com.google.common.primitives.Ints;

public class ConvertSetOfIntegerToArrayOfInteger {
	
	//From guava
	public static void funcGuava(Set<Integer> s) {
		
		int[] a = Ints.toArray(s);
		
		System.out.println(Arrays.toString(a));
		
	}
	
	public static void funcApache(Set<Integer> s) {
		
		//int[] a = ArrayUtils.toPrimitive(s.toArray(new Integer[0]));
		
		
		
	}

	public static void main(String[] args) {

		Set<Integer> hs = new HashSet<Integer>();
		
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		
		funcGuava(hs);
		
	}

}
