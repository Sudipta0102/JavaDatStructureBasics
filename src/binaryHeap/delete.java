package binaryHeap;

import java.util.Arrays;

public class delete {

	static void func(int[] a) {

		int arrLen = a.length;
		int heapLen = a.length - 1;
		int i = 0;
		int largest = 0;
		//int height = height(heapLen);
		//swap the root(1st value of the array) with
		//last leaf node(which is last value of the array) 
		int temp = a[0];
	    a[0] = a[arrLen-1];
		a[arrLen-1] = temp;
		
		//System.out.println(Arrays.toString(a));
		
		while(i<heapLen) {
		
			int left = 2*i+1;
			int right = 2*i+2;
			
			
			if(left<heapLen && a[i]<a[left]) {
				
				largest = left;
				
			}
			
			if(right<heapLen && a[largest]<a[right]) {
				
				largest = right;
			}
			
			if(largest != i) {
				
				int temp1 = a[i];
				a[i] = a[largest];
				a[largest] = temp1;
			}
			
			System.out.println(Arrays.toString(a));
			
			//if the current root is swapped with 
			//left child
			if(largest == left)
				i = 2*i+1;
			//if the current root is swapped with 
			//right child
			else if(largest == right)
				i = 2*i+2;
			//if swap didn't happen, it's 
			//already in the right position
			else if(largest == i)
				break;
		}
				
		
		for(int j=0;j<heapLen;j++) {
			
			System.out.print(a[j]+" ");
			
		}
		System.out.println();
	}
		     
	// Function to calculate height
	static int height(int N) {
		//i don't understand this code
		return (int) Math.ceil(Math.log(N + 1) / Math.log(2)) - 1;
	}
	
	
	
	
	public static void main(String[] args) {
		
		int[] a = { 50, 45, 35, 33, 16, 25, 34, 12, 10 };
		
		func(a);
		
		//System.out.println(height(a.length));
		
	}
	
}
