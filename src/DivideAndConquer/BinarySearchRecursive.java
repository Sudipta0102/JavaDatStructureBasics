package DivideAndConquer;

public class BinarySearchRecursive {

	static void func(int[] a, int val, int l, int r) {
		if(l>r) {
			
			System.out.println(val + " is not present");
			
		}
		
		else {
			
			int m = (r-l)/2+l;
			
			if(a[m]==val) {
				
				System.out.println(m + " is the index");
				
			}
			
			else if (a[m]<val) {
				
				func(a, val, m+1, r);
				
			}
			
			else {
			
				func(a, val, l, m-1);
			}
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		int[] a = {1,2,5,10,20,50,100,500,1000};
		
		int l = 0;
		int r = a.length-1;
		//int m = (r-l)/2+l;
		
		func(a, 111, l, r);
		
	}
	
}
