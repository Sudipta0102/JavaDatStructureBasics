package BinarySearch;

import java.util.Arrays;

public class FirstAndLastPosInSortedArray {

	static int[] func(int[] a, int target) {
		
		int[] r = new int[2];
		Arrays.fill(r, -1);
		
		int start = 0;
		int end = a.length - 1;
		
		//this is for starting index
		while(start<=end) {
			
			int mid = start+(end-start)/2;
			
			if(a[mid]==target) {
				end = mid -1;
				r[0] = mid;
				
			}
			else if(target>a[mid])
				start = mid+1;
			else
				end = mid -1;
		}
		
		start = 0;
		end = a.length - 1;
		//this is for last index
		while(start<=end) {
			
			int mid = start+(end-start)/2;
			
			if(a[mid]==target) {
				start = mid + 1;
				r[1] = mid;
				
			}
			else if(target>a[mid])
				start = mid+1;
			else
				end = mid -1;
		}
		
		return r;
	}
	
	static int[] searchRange(int[] a, int target) {
		
		int[] r = {-1, -1};
		
		r[0] = search( a, target, true);
		r[1] = search( a, target, false);
		
		return r;		
	}
	
	static int search(int[] a, int target, boolean firstIndexPresent){
		
		int start = 0;
		int end = a.length - 1;
		int ans = -1;
		
		while(start<=end) {
			
			int mid = start + (end - start)/2;
			
			if(a[mid] == target) {
				ans = mid;
				if(firstIndexPresent)
					end = mid-1;					
				else
					start = mid+1;
			}
			else if(target>a[mid])
				start = mid+1;
			else
				end = mid-1;
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
	
		int[] a = {5,7,7,7,7,8,9};
		
		int target = 7;
		
		//int[] res = func(a, target);
		int[] res = searchRange(a, target);
		
		System.out.println(Arrays.toString(res));
	}
	
}
