package recursion.PracticeConfidenceGain;

public class printArrayElements {

	static void func(int[] a, int len) {
		
		if(len<0) {
			
			return;
				
		}
		
		func(a, len-1);
		
		System.out.println(a[len]);
		
		
	}
	
	
	public static void main(String[] args) {

		int[] a = {1,2,3,4,5};
		
		
		func(a, a.length-1);

	}

}
