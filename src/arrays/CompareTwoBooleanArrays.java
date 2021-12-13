package arrays;

import java.util.Arrays;

public class CompareTwoBooleanArrays {
	
	public static void func(boolean[] a, boolean[] a1) {
		
		System.out.println(Arrays.equals(a, a1));
		
	}
	
	public static void funcAnother(boolean[] a, boolean[] b) {
		
		if(a.length!=b.length) {
		
			System.out.println("Not equal");
			return;
			
		}
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]!=b[i]) {
				
				System.out.println("not euaql");
				break;
			}
			
			
		}
		
		
	}

	public static void main(String[] args) {

		boolean[] a = new boolean[] { true, true, false };
        boolean[] a1 = new boolean[] { true, true, false };
        boolean[] a2 = new boolean[] { true, false, false };

        //func(a, a2);
        
        funcAnother(a1, a2);
	}

}
