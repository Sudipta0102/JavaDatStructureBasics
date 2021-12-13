package BinarySearch;

public class FindElementInRotatedSortedArrayII {

	static int search(int[] a, int target) {
		
		int start = 0;
		int end = a.length - 1;
		int pivot = findPivot(a);
		
		if(pivot==-1){//that means array is not rotated, 
			//so perform normal binary search
			return binarySearch(a, pivot, 0, a.length-1);
		}
		if(a[pivot]==target)
			return pivot;		
		if(target>a[start])
			//pivot -1, since we already checked for pivot
			return binarySearch(a, target, start, pivot-1);
		else
			return binarySearch(a, target, pivot+1, end);
	}
	
	static int binarySearch(int[] a,int target, int start, int end) {		
		
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
	
	static int findPivot(int[] a) {
		
		int start = 0;
		int end = a.length - 1;
		
		while(start<=end) {
			
			int mid = start + (end - start)/2;
			//mid<end because if mid is the last element
			if(mid<end && a[mid]>a[mid+1]) {
				return mid;
			}
			//mid>start because if mid is the first element
			if(a[mid]<a[mid-1]) {
				return mid - 1;
			}
			
			if(mid>start && a[start]>=a[mid]) {
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[] a = {3,4,5,6,7,0,1,2};
		int[] b = {3,4,5,6,2};
		int[] c = {5,4,3,2,1};
		int[] d = {1,2,3,4,5};
		
		System.out.println(search(c, 4));
	}
}
