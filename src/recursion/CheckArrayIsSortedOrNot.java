package recursion;

public class CheckArrayIsSortedOrNot {

	static void func(int[] a, int len){
		
		if(len==a.length-1) {
			
			System.out.println("Array is sorted");
			return;
		}
		
		if(a[len]>a[len+1]) {
			
			System.out.println("not sorted");
			return;
		}
		
		func(a, len+1);
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		int[] a = {2,5,8,12,67,89};
		int[] b = {3,4,6,14,17,18,26,18};
		
		//func(a, 0);
		
		
	}
	
}
