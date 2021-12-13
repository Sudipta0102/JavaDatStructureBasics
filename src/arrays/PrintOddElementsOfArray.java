package arrays;

public class PrintOddElementsOfArray {

	public static void func(int[] a) {
		
		for(int i=1;i<a.length;i=i+2) {
			
			System.out.print(a[i]+" ");
			
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {

		int[] a = {2,1,4,2,6,3,8,5,6,3,4,2,1,0};
		
		func(a);
	}

}
