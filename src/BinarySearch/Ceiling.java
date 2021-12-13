package BinarySearch;

public class Ceiling {

	//ceiling: smallest number in the array which is greater 
	//or equal to target
	static int func(int[] a, int target) {
		
		int start = 0;
		int end = a.length-1;
		
		if(target>a[end])
			return -1;
		
		while(start<=end) {
			
			int mid = start + (end-start)/2;
			
			if(a[mid] == target)
				return mid;
				
			else if(target>a[mid])
				start = mid+1;
			
			else 
				end = mid-1;
						
		}
		
		return start;
	}
	
	public static void main(String[] args) {
		int[] a = {1,3,5,9,14,16,18};	
		System.out.println(func(a,18));
	}
}
