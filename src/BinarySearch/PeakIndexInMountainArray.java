package BinarySearch;

import java.util.Arrays;

public class PeakIndexInMountainArray {

	static int func(int[] a) {
		int start = 0;
		int end = a.length - 1;
		
		while(start<=end) {
			
			int mid = start+ (end - start)/2;
			
			if(mid==0 || mid == a.length - 1)
				return -1;
			
			//if the mid element is greater than (both 
			//previous and) next element	then, it's the peak.		
			else if(a[mid]>a[mid+1] && (a[mid]>a[mid-1])) {			
				return mid;				
			}
			else if(a[mid]<a[mid+1]) {
				start = mid+1;
			}
			else {
				end = mid-1;
			}			
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		//These are called mountain arrays or bitonic(not sure about this) 
		//array because it has a peak in the middle.  
		int[] a = {0,2,1,0};
		int[] b = {0,1,0};
		int[] c = {0,1,2,3,4,2,0};
		int[] d = {0,2,4,5,4,3,2,1,0};
		int[] e = {1,2,3,4,5};
		int[] f = {3,2,1};
		
		//System.out.println(Arrays.toString(f));
		System.out.println(func(f));
		
	}
}
