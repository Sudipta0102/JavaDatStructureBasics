package arrays;

import java.util.Arrays;

public class RemoveAllOccurancesOfOneElement {
	
	public static void func(int[] a, int element) {
		
		int n = a.length;
		int count = 0;
		
		for(int i=0;i<n;i++) {
			
			if(a[i]==element) {
				
				count++;
				
			}
			
		}
		
		//int[] newArr = new int[n=count];//this doesn't give error!!!!
		int[] newArr = new int[n-count];
		int j =0;
		for(int i=0;i<n;i++) {
			
			if(a[i]==element) {
				
				continue;
			}
			else if(j<newArr.length){
				
				newArr[j] = a[i];
				j++;
			}
			
		}
		
		System.out.println(Arrays.toString(newArr));
	}

	public static void main(String[] args) {
		
		int[] a = {2,1,3,3,4,2,3,5,6,4,5,3,7};

		func(a, 3);
	}

}
