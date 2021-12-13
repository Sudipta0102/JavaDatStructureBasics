package arrays;

import java.util.Arrays;

www.geeksforgeeks.org/sort-an-array-and-insert-an-element-inside-array-in-java/

public class SortAnArrayAndAddAnElementInsideArray {
	
	public static void func(int[] a, int element) {
		
		//this part is for sorting and I ised selection sort
		int n = a.length;
		int smallest;
		
		for(int i=0;i<n-1;i++) {
			
			smallest = i;
			for(int j =i+1;j<n;j++) {
				if(a[smallest]>a[j]) {
					
					smallest = j;
					
				}
				
			}
			
			if(smallest!=i) {
				
				int temp = a[smallest];
				a[smallest] = a[i];
				a[i] = temp; 
				System.out.println(Arrays.toString(a));
			}
		}	
	}
	
	/*
	 * 1. create the an array of N+1 size
	 * 2. copy first array to new array
	 * 3. add the new element at the last
	 * 4. sort the new array
	 */
	public static void funcAnother(int[] a, int element) {
		
		int n = a.length;
		
		//creating and copying value into new array
		int[] newArr = Arrays.copyOf(a, n+1);
		
		System.out.println(Arrays.toString(newArr));
		
		//adding the new value at the last
		newArr[newArr.length-1] = element;
		
		System.out.println(Arrays.toString(newArr));
		
		//sort the array. I will use selection sort because 
		//I am practicing that now a days. 
		int min = 0;
		
		int N = newArr.length;
		
		for(int i=0;i<N-1;i++) {
			
			min = i;
			
			for(int j=i+1;j<N;j++) {
				
				if(newArr[min]>newArr[j]) {
					
					min = j;
					
				}			
			}
			if(min!=i) {
				
				int temp = newArr[min];
				newArr[min] = newArr[i];
				newArr[i] = temp;
				//System.out.println(Arrays.toString(newArr));
				
			}
			
		}
		
		System.out.println(Arrays.toString(newArr));
		
		
	}

	/*
	 * 1. Sort the main array(Using selection sort now)
	 * 2. create the array of Size N+1
	 * 3. traverse the array until you get an element greater than 
	 * the element you need to insert
	 * 4. Insert the element 
	 */
	
	eta hoyni...
	public static void funcLast(int[] a,int element) {
		
		int n = a.length;
		int min;
		//sorting the array
		for(int i=0;i<n-1;i++) {
			
			min = i;
			for(int j=i+1;j<n;j++) {
				if(a[min]>a[j]) {
					
					min = j;
					
				}
				
			}
			
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
			
		}
		
		System.out.println(Arrays.toString(a));
		
		int[] newArr = new int[n+1];
		int counter=0;
		
		for(int i=0;i<newArr.length-1;i++) {
			
			if(counter<n) {
				
				newArr[i] = a[counter];
				counter++;
				
				
			}
				
			//System.out.println(Arrays.toString(newArr));
		}
		System.out.println(Arrays.toString(newArr));
		
		int eleIdx = 0;
		for(int i=0;i<newArr.length-1;i++) {
			
			if((newArr[i]>element) && (newArr[i+1]<element))
				
				newArr[i] = element;
				eleIdx = i; 
		}
		
		System.out.println(Arrays.toString(newArr));
		
		
		
	}
	
	
	public static void main(String[] args) {

		//int[] a = {39,36,12,17,8,32,29,69,20,78};
		
		int[] b = {8,7,6,5,4,3,2,0};	
		//func(b);
		
		funcLast(b, 1);
	}

}
