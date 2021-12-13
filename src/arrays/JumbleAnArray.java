package arrays;

import java.util.Arrays;
import java.util.Random;

public class JumbleAnArray {
	
	public static void func(int[] a) {
		
		int n = a.length;
		Random random = new Random();
		
		System.out.println(random.nextInt());
		
		for(int i=0;i<n;i++) {
			
			int randNum = i + random.nextInt(n-i);
			
			int temp = a[i];
			a[i] = a[randNum];
			a[randNum] = temp;
			
			System.out.print(a[i]+" ");
			
		}
		
	}

	public static void main(String[] args) {

		int[] a = {0,1,2,3,4,5,6,7};
		
		func(a);

	}

}
