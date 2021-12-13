package recursion;

public class CheckIfArrayIsSorted {

	static boolean func(int[] a, int i) {
		
		if(i>=a.length-1) {
			return true;
		}
		
		if(a[i]<a[i+1]) {
			return func(a, i+1);
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		int a[] = {1,2,3,4,3};
		System.out.println(func(a, 0));
	}
}
