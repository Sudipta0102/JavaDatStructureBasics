package arrays;

public class FindMaximumAndMinimumSum {
	
	public static void func(int[] a) {
		
		int n = a.length;
		
		int min;
		
		for(int i=0;i<n-1;i++) {
			
			min = i;
			for(int j=i+1;j<n;j++) {
				
				if(a[min]>a[j]) {
					
					min = j;
					
				}
				
			}
			
			if(min != i) {
				
				int temp = a[min];
				a[min] = a[i];
				a[i] = temp;
				
			}
		}
		
		System.out.println("smallest sum: "+(a[0]+a[1]));
		System.out.println("largest sum: "+(a[n-1]+a[n-2]));
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {3,5,1,6,4,2};
		
		func(a);
		
	}

}
