package BinarySearch;

public class FindInMountainArray {

	static int searchFountainArray(int[] a, int target) {
		
		int start = 0;
		int end = a.length - 1;
		
		int left, right;
			
		//First, find the peak, in this case This is my mid
		//left side -> an array of ascending order
		//right side-> an array of descending order
		//on which i am going run my binary search
		int mid = findPeak(a);
		
		//left and right binary search are applied 
		//when mid is not the target value
		if(a[mid]!=target) {
			//calling the binary search on left and right
			left = binarySearch(a, target, start, mid-1, true);
			if(left==-1) {
				//right is only called when left doesn't yield any value
				right = binarySearch(a, target, mid+1, end, false);
				return right;
			}
			else return left;
		}else {	
			return mid;
		}	
	}
		
	 static int binarySearch(int[] a, int target, int start, int end, boolean isAscending) {		 
		 while(start<=end) {			 
			 int mid = start+ (end-start)/2;

			 if(a[mid]==target)
				 return mid;
			 if(isAscending) {
				 if(target>a[mid])
					 start = mid+1;
				 else 
					 end = mid-1;
			 }
			 else {
				 if(target>a[mid])
					 end = mid-1;					 
				 else 
					 start = mid+1;			 
			 }
		 }

		return -1;
	}
	static int findPeak(int[] a) {
		
		int start = 0;
		int end = a.length - 1;
		
		while(start<end) {
			
			int mid = start + (end - start)/2;
			
			if(a[mid] > a[mid+1]) { 
				// then peak is either mid or in the left side of mid		
				end = mid;// and not (mid - 1) your mid is a potential peak.
				//so needs to take the current mid into account for
				//later passes of loop.
			}	
			else {
				//if(a[mid]<a[mid+1])
				//then peak has to be at the right side of mid
				start = mid + 1;
			}		
		}
		
		return start;
	}
	
	public static void main(String[] args) {
		
		int[] a = {1,2,4,5,3,1};
		int[] b = {0,2,6,7,6,5,4,3,2,1,0};//target = 6;
		int target = 3;
		//int[] c = {2,5,8,12,16,79,455};
		//int[] d = {5,3,2,1};
		
		System.out.println(searchFountainArray(a, 3));
		
		//System.out.println(findPeak(b));
		
		//System.out.println(binarySearch(d, 1, 0, d.length-1, false));
	}
	
}
