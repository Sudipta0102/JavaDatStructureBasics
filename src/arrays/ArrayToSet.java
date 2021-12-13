package arrays;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ArrayToSet {
	
	public static void func(int[] a) {
		
		Set<Integer> hs = new HashSet<>(a.length);
		
		for(int i=0;i<a.length;i++) {
			
			hs.add(a[i]);
			
		}
		
		System.out.println(hs);
	}
	
	//generic way
	public static <T> void func(T[] a) {
		
		Set<T> hs = new HashSet<>(a.length);
		
		for(T t: a) {
			
			hs.add(t);
			
		}
		
		System.out.println(hs);
	}
	
	//Arrays.aslist
	public static <T> void funcAsList(T[] a) {
		
		Set<T> hs = new HashSet<>(Arrays.asList(a));
		
		System.out.println(hs);
		
	}
	
	//Collections.addAll
	public static <T> void funcAddAll(T[] a) {
		
		Set<T> hs = new HashSet<>();
		
		Collections.addAll(hs, a);
		
		System.out.println(hs);
		
	}

	public static void main(String[] args) {

		int[] a = {1,2,3,4};

		func(a);
		
		String[] sArr = {"I", "Am", "You"};
		
		Character[] cArr = {'I','a','m','y','o','u'};
		
		func(sArr);
		
		func(cArr);
		
		funcAsList(sArr);
		
		funcAddAll(cArr);
	}

}
