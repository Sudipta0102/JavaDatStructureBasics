package BinarySearch;

public class Floor {

	//Floor: largest number in the array which is less than 
	//or equal to target.
	static int func(int[] a, int target) {
		
		int start = 0;
		int end = a.length-1;
		
		if(target<a[start])
			return -1;
		
		while(start<=end) {
			
			int mid = start + (end - start)/2;
			
			if(target==a[mid])
				return mid;
			
			else if(target>a[mid])
				start = mid + 1;
			
			else
				end = mid - 1;	
			
			if(start==end)
				return start;
		}
		
		return end;
	}
	
	public static void main(String[] args) {
		int[] a = {1,3,5,9,14,16,18};
		
		System.out.println(func(a, 100));//1 element:3
	}
}
