package arrays;

public class PrintSmallestElementOfArray {
	
	public static void func(int[] a) {
		
		int smallest = a[0];
		
		for(int i=0;i<a.length-1;i++) {
			
			if(a[i]>a[i+1]) {
				
				smallest = a[i+1];
			}
		}
		
		System.out.println(smallest);
	}

	public static void main(String[] args) {

		int[] a = {2,1,4,2,6,3,8,5,6,3,4,2,1,10};
		
		func(a);

	}

}
