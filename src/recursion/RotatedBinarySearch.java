package recursion;

public class RotatedBinarySearch {

	static int rbs(int[] a, int target, int start, int end) {
		
		if(start>end) {
			return -1;
		}
		
		int mid = start + (end-start)/2;
		
		if(a[mid]==target)
			return mid;
		
		if(a[mid]>=a[start]) {
			if(target>=a[start] && target<=a[mid])
				return rbs(a, target, start, mid-1);
			else
				return rbs(a, target, mid+1, end);
			
		}
		
		//5,6,1,2,3,4
		if(target >= a[mid] && target<=a[end])
			return rbs(a, target, mid+1, end);
		
			
		return rbs(a, target, start, mid-1);
		
		
	}
	
	public static void main(String[] args) {
		
		int[] a = {5,6,1,2,3,4};
		int[] b = {4,5,6,7,8,1,2,3}; 
		int target = 2;
		
		System.out.println(rbs(b, target, 0, b.length-1));
		
		
		
	}
	
}
