package BinarySearch;

public class ElementPositionInAnInfiniteArray {

	//here is the thing: infinite array means, we don't know 
	//the length of the array. In this case, think of a reverse 
	//Binary search
	//What I mean to say is, binary search goes like 
	//N->N/2->N/4->N/8->.....->1 (log n) where N is nos of elements
	//Now think of this as 2->(N*2)4->(4N)8->....->N
	
	static int func(int[] a, int target) {
		
		int start = 0;
		int end = 1;
		int tempLen = 2;
		int ans = -1;
		
		boolean targetInRange = false;
		
		while(targetInRange==false) {
			
			if(target>=a[start] && target<=a[end]) {
				
				ans = binarySearch(a, start, end, target);
				targetInRange = true;
			}else {
				//new start is subsequent value of previous end 
				start = end+1;
				//new end would be double of previous array size 
				end = start+tempLen*2;//i can do better if I say end = start*tempLen*2;
				tempLen = (end - start) + 1;
			}
			
		}
		
		return ans;
	}
	
	static int binarySearch(int[] a, int start, int end, int target) {
		
		while(start<=end) {
			
			int mid = start + (end - start)/2;
			
			if(a[mid]==target)
				return mid;
			else if(target>a[mid])
				start = mid + 1;
			else
				end = mid - 1;
					
		}				
		
		return -1;
	}

	public static void main(String[] args) {
		
		int[] a = {5,6,7,8,9,12,15,17,18,21,25,28,29,30,34,36,39,42,43,47,50};
		
		System.out.println(func(a, 18));
		
	}
}
