package arrays;

public class FindElementsWithLargestDifferenceInArray {
	
	public static void func(int[] a) {
		
		int smallest = a[0];
		int largest = a[0];
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]<smallest) {
				
				smallest = a[i];
			}
			
			if(a[i]>largest) {
				
				largest = a[i];
				
			}
			
		}
		
		
		System.out.println(smallest+ " and "+ largest + " has he biggest difference between them");
		
	}

	public static void main(String[] args) {

		int[] arr = {1,2,2,3,4,5,6,1,9,9};
		
		func(arr);
		

	}

}
