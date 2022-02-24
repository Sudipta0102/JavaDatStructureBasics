package arrayInterviewQuestions;

import java.util.Arrays;

public class MoveZerosToRightOneToLeft {

	
	public static void main(String[] args) {
		int[] a = {1,0,1,0,1,0,1,0};
		
		func(a);
	}

	private static void func(int[] a) {
		
		int n = a.length;
		int count = 0;
		
		for(int i=0;i<n;i++) {
			if(a[i]==1) {
				a[count] = 1;
				count++;
			}
		}
		
		
		while(count<n) {
			a[count] = 0;
			count++;
		}
		
		
		System.out.println(Arrays.toString(a));
	}
}
