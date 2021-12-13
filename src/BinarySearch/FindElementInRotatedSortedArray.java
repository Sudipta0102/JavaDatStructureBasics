package BinarySearch;

public class FindElementInRotatedSortedArray {

	static int searchElement(int[] a, int target) {
		
		/*
		 * 1. find pivot i.e. largest element in the array
		 * 2. run two different binary search on left and 
		 * right side of array
		 */
		
		int start = 0;
		int end = a.length - 1;
		int left, right;
		int pivot = findPivot(a);
		
		left = binarySearch(a, target, start, pivot);
		if(left==-1) {
			right = binarySearch(a, target, pivot+1, end);
			return right;
		}
		else {
			return left;
		}
	}
	private static int binarySearch(int[] a,int target, int start, int end) {		
		
		while(start<=end) {
			
			int mid= start + (end-start) /2;
			
			if(a[mid]==target)
				return mid;
			else if(target>a[mid]) {
				start = mid+1;				
			}else {
				end = mid-1;
			}
			
		}
		return -1;
	}
	
	private static int findPivot(int[] a) {
		
		int start = 0;
		int end = a.length - 1;
		
		while(start<end) {
			
			int mid = start + (end - start)/2;
			
			if(mid==0 || mid==a.length-1) {
				return mid;
			}
			
			if(a[mid]>a[end] && a[mid]>a[mid-1]) {
			
				if(a[mid]>a[mid+1])
					return mid;
				else
					start = mid+1;
			}	
			else
				end = mid;
			
		}
		return start;
	}




	public static void main(String[] args) {
		
		//int[] a = {3,4,5,6,7,0,1,2};
		
		//this case is failing when the array is rotated by array length
		//or when pivot is 0th element of an array.
		//maybe it needs order agnostic binary search...will try later
		//int[] a = {5,4,3,2,1};
		
		
		int[] a = {3,4,5};
	
		System.out.println(searchElement(a, 0));
	
		//System.out.println(findPivot(a));
	}
}
