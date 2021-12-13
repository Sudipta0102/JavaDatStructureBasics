package arrays;

import java.util.Arrays;

public class SortInDescendingOrder {
	
	//Library function
	public static void funcLibrary(int[] a) {
		
		Arrays.sort(a);
		
		for(int i=a.length-1;i>=0;i--) {
			
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
	}
	
	//bubble sort
	public static void funcBubble(int[] a) {
		
		int n = a.length;
		
		for(int i=0;i<n;i++) {
			
			int k = n-1-i;
			
			for(int j=0;j<k;j++) {
				
				int x = a[j+1];
				int y = a[j];
				
				if(a[j]<a[j+1]) {
					
					
					
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					//System.out.println(Arrays.toString(a));
					
				}
				
			}
			
		}
		
		System.out.println(Arrays.toString(a));
	}
	
	//selection sort
	public static void funcSelection(int[] a) {
	
		int n = a.length;
	
		for(int i=0;i<n-1;i++) {
			
			int minIdx = i;
			for(int j=i+1;j<n;j++) {
				
				if(a[minIdx]<a[j]) {
					
					minIdx = j;
					
				}
				
			}
			
			if(minIdx != i) {
				
				int temp = a[i];
				a[i] = a[minIdx];
				a[minIdx] = temp;
				//System.out.println(Arrays.toString(a));
			}
			
		}
			
		System.out.println(Arrays.toString(a));
	}
	
	public static void funcInsertion(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			/*
			 * Move elements of arr[0..i-1], that are greater than key, to one position
			 * ahead of their current position
			 */
			//System.out.println("-------------");
			//System.out.println("-------------");
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
				
				System.out.println(Arrays.toString(arr));
				
			}
			System.out.println("-------------");
			//System.out.println("-------------");
			arr[j + 1] = key;
		}
		
		System.out.println(Arrays.toString(arr));
	}
	

	public static void main(String[] args) {


		
		int[] d = {4,8,5,3};
		
		//4,8,5,5 key = 3;
		
		//4,8,5,8 key = 3;
		
		//
		
		System.out.println(Arrays.toString(d));
		
		funcInsertion(d);
		
		
		
		
		
		
		
		/*
		
		int[] a = {4,8,5,3,0,7,6,2,1};
		
		System.out.println(Arrays.toString(a));
		
		funcLibrary(a);
		
		System.out.println();
		
		
		int[] b = {4,8,5,3,0,7,6,2,1};
		
		System.out.println(Arrays.toString(b));
		
		funcBubble(b);
		
		System.out.println();
		
		
		int[] c = {4,8,5,3,0,7,6,2,1};
		
		System.out.println(Arrays.toString(c));
		
		funcSelection(c);
		
		System.out.println();


		*/
	}

}
