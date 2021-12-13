package arrayInterviewQuestions;

public class SearchArray {

	public static int searchInsert(int[] nums, int target) {

		int l = 0;
		int r = nums.length - 1;
		//int idx = -1;
		int mid = 0;
		
		

		while (l <= r) {

			mid = (r - l) / 2 + l;
			
			

			if (nums[mid] == target) {
				//idx = mid;
				return mid;
			}	
			else if (nums[mid] < target) {
				l = mid + 1;
				// idx = l;
			} else {
				r = mid - 1;
				// idx = r;
			}
		}

		return r+1;
	}

	
	public static void main(String[] args) {
		
		int[] a = {1,3,5};
		int val = 4;
		
		System.out.println(searchInsert(a, val));
		
		int[] b;
		
		boolean x=true;
		
		if(x==true) {
			
			b = new int[a.length+1];
		}
		else {
			b = new int[a.length];
			
		}
		
		System.out.println(b.length);
	}
}
