package recursion;

public class LinearSearchInArray {

	static boolean search(int a[], int target, int idx) {
		
		if(idx>=a.length)
			return false;
		
		if(a[idx] == target)
			return true;
		
		return search(a, target, idx+1);
		
	}
	
	//another way to write this one would be
	static boolean searchAgain(int[] a, int target, int idx) {
		
		if(idx>=a.length)
			return false;
		
		return a[idx]==target || searchAgain(a, target, idx+1);	
	}
	
	public static void main(String[] args) {
		
		int[] a = {3,2,1,18,9};
		int target = 3;
		
		System.out.println(search(a, target, 0));
		
	}
	
}
