package recursion.PracticeConfidenceGain;

public class LargestElementOfArray {

	static int func(int[] a, int i ) {
	
		int x;
		if(i<0) {
			
			return 0;
			
		}
		
		x = func(a, i-1);
		if(x<a[i])
			x = a[i];
		
		
		return x;
	}
	
	
	
	public static void main(String[] args) {
		
		int[] a = {2,1,5,3,6,7};
		
		System.out.println(func(a, a.length-1));

	}

}
