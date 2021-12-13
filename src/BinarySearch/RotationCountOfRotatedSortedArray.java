package BinarySearch;

public class RotationCountOfRotatedSortedArray {
	
	static int countRotation(int[] a) {
		
		int pivot = findPivot(a);
		
		return pivot+1;
		
	}
	
	static int findPivot(int[] a) {
		
		int start = 0;
		int end = a.length-1;
		
		while(start<=end) {
			
			int mid = start + (end - start)/2;
			
			if(mid<end && a[mid]>a[mid+1]) {
				return mid;
			}
			if(mid>start && a[mid]<a[mid-1]) {
				return mid-1;
			}
			if(a[mid]>a[start])
				start = mid+1;
			else
				end = mid-1;
			
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] a = {15,18,2,3,5,12};
		int arr[] = {7, 9, 11, 12, 5};
		int arr1[] = {7, 9, 11, 12, 15};
		
		System.out.println(countRotation(arr1));
		
	}

}
