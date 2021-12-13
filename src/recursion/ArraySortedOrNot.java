package recursion;

public class ArraySortedOrNot {

	static boolean func(int[] a, int idx) {
		
		if(idx == a.length-1)
			return true;
		
		if(a[idx]<a[idx+1]) {
			
			return func(a, idx+1);
			
		}
		
		return false;		
	}
	
	//another way to write the same thing
	static boolean funcAnother(int[] a, int idx) {
		
		if(idx==a.length-1)
			return true;
		
		return a[idx]<a[idx+1] && funcAnother(a, idx+1);
		
	}
	
	public static void main(String[] args) {
		
		int[] a = {12,21,38,45,53,67};
		
		System.out.println(funcAnother(a, 0));
		
	} 
	
}
