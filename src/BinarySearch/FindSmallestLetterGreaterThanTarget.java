package BinarySearch;

public class FindSmallestLetterGreaterThanTarget {

	static char func(char[] a, char target) {
		
		int start = 0;
		int end = a.length-1;
		
		if(target>=a[end])
			return a[start];
		
		while(start<=end) {
			
			int mid = start + (end - start)/2;
			
			if(a[mid]==target) {
				return a[mid+1];
			}
			else if(target>a[mid]) {	
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
			
		}
		
		return a[start];
	}
	
	public static void main(String[] args) {
		
		char[] a = {'c','f','j'};
		
		//char target = 'j'; //ans: 'c'
		char target = 'c'; //ans: 'f'
		
		System.out.println(func(a, target));
		
	}
}
