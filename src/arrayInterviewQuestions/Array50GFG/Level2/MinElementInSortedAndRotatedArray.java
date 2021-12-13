package arrayInterviewQuestions.Array50GFG.Level2;

public class MinElementInSortedAndRotatedArray {

	static int func(int[] a) {
		
		int l = 0;
		int r = a.length-1;
		
		while(l<r) {
			
			int mid = l + (r-l)/2;
			
			if(a[mid]==a[r])
				r--;
			else if(a[mid]>a[r]) {
				l = mid+1;		
			}
			else {
				r = mid;
			}
			
		}
		
		return a[r];
		
	}
	
	
	public static void main(String[] args) {
	
		int arr8[] =  {2, 3, 4, 5, 6, 7, 8, 1};
		
		System.out.println(func(arr8));
		
	}
	
}
