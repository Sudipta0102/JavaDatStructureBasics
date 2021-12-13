package arrays;

import java.util.Arrays;

public class DynamicArray {
	
	private int[] arr;
	
	private int capacity;
	
	private int current;
	
	//default constructor to initialize an array of length 1.  
	public DynamicArray() {
		
		arr = new int[1];
		current = 0;
		capacity = 1;
		
	}
	
	//function to add an element at the last
	public void push(int data) {
		
		/*
		 * if number of elements is equal to the capacity, 
		 * then we don't have any space to accommodate any more
		 * elements. Here here we are doubling the capacity 
		 * of the array.
		 */
		if(current==capacity) {
			
			int[] temp = new int[capacity*2];
			
			//copying the old array elements to the new array
			for(int i=0;i<capacity;i++) {
				temp[i] = arr[i];
			}
			
			
			// doubling the capacity;
			capacity = capacity*2;
			//again, copy all the value back to the main array, 
			//this lets you copy all the value from the temp as 
			//well as the bring the new size (size of the temp 
			//array i.e. capacity*2) to the main array. So, now, 
			// the size of the array is increased. 
			//I didn't know that. What an asshole you are.
			arr = temp;
		
		}
			
		//inserting data
		arr[current] = data;
		current++;
		
		
		
		System.out.println("---------");
		
	}
	
	public void push(int data, int index) {
		
		if(index==capacity) {
			
			push(data);
			
		}
		else {
			
			arr[index] = data;
			
		}
		
	}
	
	public void pop() {
		
		current--;
		
	}
	
	public int size() {
		
		return current;
		
	}
	
	public int getCapacity() {
		
		return capacity;
		
	}
	
	public void print() {
		
		for(int i=0;i<current;i++) {
			
			System.out.print(arr[i]+ " ");
			
		}
		System.out.println();
	}

	
	
	public static void main(String[] args) {

//		int[] a = {1,2,3};
//		
//		int[] b = {11};
//		
//		b = a;
//		
//		System.out.println(Arrays.toString(a));
//		
//		System.out.println(Arrays.toString(b));
		
		DynamicArray obj = new DynamicArray();
		
		obj.push(11);
		obj.push(12);
		obj.push(13);
		
		
		obj.print();
		
		obj.pop();
		
		obj.print();
		
		
		System.out.println(obj.size());
		System.out.println(obj.getCapacity());
	}

}
