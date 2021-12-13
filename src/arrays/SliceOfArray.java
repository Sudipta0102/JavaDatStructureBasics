package arrays;

import java.util.Arrays;

public class SliceOfArray {
	
	//naive
	public static void func(int[] a, int start, int end) {
		
		int n = a.length;
		int[] newA = new int[(end-start)]; 
		int j =0;
		
		if(start<0 && end> a.length) {
			
			System.out.println("Invalid Index");
			return;
			
		}
		
		for(int i= start;i<end;i++) {
			
			newA[j] = a[i];
			j++;
		}
		
		System.out.println(Arrays.toString(newA));
	}
	
	public static void funcLibrary(int[] a, int start, int end) {
		
		int[] newArr = Arrays.copyOfRange(a, start, end);
		//I dunno why i need to do end+1; I don't understand 
		//and it sucks to be completely honest. 
		//After a while:
		// Okay, I get it now. It is there to give the user 
		//that comfort of choosing a.length as the end value
		//instead of a.length-1....i think :P 
		
		System.out.println(Arrays.toString(newArr));
		
	}
	

	public static void main(String[] args) {

		int[] a = {1,2,3,4,5,6,7};
			
		func(a, 1, a.length);
		
		funcLibrary(a, 1, a.length);
		

	}

}
