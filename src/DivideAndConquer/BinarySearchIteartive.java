package DivideAndConquer;

public class BinarySearchIteartive {

	static void func(int[] a, int val) {
		
		int l = 0, r = a.length-1;
		int m = 0;
		
		while(l<=r) {
			
			m = (r-l)/2 + l;
			
			if(a[m]==val) {
				
				System.out.println(m + " is the index");
				return;
			}
			
			else if(a[m]<val) {
				
				l = m+1;
			}
			
			else {
				
				r = m-1;
				
			}
				
		}
		System.out.println(val + " is not present");	
	}
	
	
	public static void main(String[] args) {
		
		int[] a = {1,2,5,10,20,50,100,500,1000};
		
		func(a, 11);
		
	}
}
