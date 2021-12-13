package arrayInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlternatePosAndNeg {

	static void func(int[] a) {
		
		int n = a.length;
		List<Integer> neg = new ArrayList<Integer>();
		List<Integer> pos = new ArrayList<Integer>();
		
		for(int i: a) {
			if(i<0) {
				neg.add(i);
			}
			else {
				pos.add(i);
			}
		}
		
		int j = 0;
		int k = 0;
		
		//even index -> negative element
		//odd index -> positive element
		
		
		// There are two conditions you can add the elements into the array.
		//
		// 1. even index -> negative element and odd index -> positive element;
		// This can only happen when both +ve and -ve are left to print.
		// 
		// 2. One more scenario is there is either one of them are left to print 
		// or not present to begin with. That's why if either one of them are empty,
		// then, don't care about the index, just print the other one.
		for(int i=0;i<n;i++) {
			if(pos.isEmpty() || (i%2==0 && j<neg.size())) {
				a[i] = neg.get(j);
				j++;
			}
			
			if(neg.isEmpty() || (i%2==1 && k<pos.size())) {
				a[i] = pos.get(k);
				k++;
			}			
		}
		
		System.out.println(Arrays.toString(a));
	}
	
	// Without taking extra space
	public static void funcAnother(int[] a) {
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		int Arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
		
		func(Arr);
		
			
	}
	
}
