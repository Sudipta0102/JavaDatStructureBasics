package arrays;

public class PrintEvenPositionedElement {
	
	public static void func(int[] a) {
		
		for(int i=0;i<a.length;i=i+2) {
			
			System.out.print(a[i]+" ");
			
		}
		
		System.out.println();
	}

	public static void main(String[] args) {

		int[] a = {0,1,2,3,4,5,6,7,8};
		
		func(a);

	}

}
