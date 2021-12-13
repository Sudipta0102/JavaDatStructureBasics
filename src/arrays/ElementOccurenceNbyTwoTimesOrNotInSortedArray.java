package arrays;

public class ElementOccurenceNbyTwoTimesOrNotInSortedArray {
	
	public static void func(int[] a, int element) {
		
		int n = a.length;
		int count = 0;
		
		for(int i =0;i<n;i++) {
			
			if(a[i]==element) {
				
				count++;
				
			}
			
		}
		
		if(count>n/2) {
			
			System.out.println(element +" appears more than " + n/2 + " times.");
			
		}
		else {
			
			System.out.println(element +" appears " + count + " times.");
		}
	}
	
	public static void func(int[] a) {
		
		binary search diyeo kora jaay..a.korte hobe pore 
		
	}

	public static void main(String[] args) {

		 int arr[] = { 1, 1, 2, 3, 3, 3, 3, 3, 3,
                 3, 3, 3, 4, 5, 6, 6, 7 };
		
		 
		 func(arr, 6);

	}

}
