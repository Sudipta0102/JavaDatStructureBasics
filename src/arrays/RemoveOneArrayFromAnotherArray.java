package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class RemoveOneArrayFromAnotherArray {
	//this is using library function
	public static void func(ArrayList<Integer> al, ArrayList<Integer> al1) {
		
		al.removeAll(al1);
		
		System.out.println(al);
		
		
	}
	
	//this is using static array and the space complexity is O(n) 
	public static void funcAnother(int[] a, int[] b) {
		
		
		
		
		int aLen = a.length;
		int bLen = b.length;
		
		if(aLen<bLen) {
			
			System.out.println("Invalid Index");
			
		}
		
		int[] res = new int[aLen-bLen];
		int resCount =0;
		int temp = 0;
		
		for(int i=0;i<aLen;i++) {
			for(int j=0;j<bLen;j++) {
				
				int x= a[i];
				int y= b[j];
				
				if(x!=y) {
					
					temp = x;
				}
				
				else {
					
					temp = Integer.MIN_VALUE;
					break;
				}
				
			}
			
			if(resCount<res.length && temp!=Integer.MIN_VALUE) {
				
				res[resCount] = a[i];
				resCount++;
				System.out.println(Arrays.toString(res));
			}
		}
		
				
	}
		
	//this is using object type elements in arraylist and needs to override
	//equals() and hashCode() method.
	private String name;
	private int id;
	
	public RemoveOneArrayFromAnotherArray(String name, int id) {
		
		this.name = name;
		this.id = id;
	}	
	
	//getter and setter
	public void setName(String name) {
			
			this.name = name;
	}
	
	public String getName() {
		
		return name;
		
	}
		
	public void setName(int id) {
		
		this.id = id;
	}
	
	public int getId() {
		
		return id;
	}
		
	
	//Override equals() method
	public boolean equals(Object obj) {
		
		if(this == obj) {
			return true;
		}
		
		if(obj instanceof RemoveOneArrayFromAnotherArray)
			return false;//why?????!!!!!!!!
			
		RemoveOneArrayFromAnotherArray that = (RemoveOneArrayFromAnotherArray)obj;
		
		return Objects.equals(getName(), that.getName())
				&& Objects.equals(getId(), that.getId());
		
	}
	
	
	public int hashCode() {
		
		return Objects.hash(getId(), id);
	}
	
	public String toString() {
		
		return this.getId() + " : " + this.getName();
		
	}

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		
		ArrayList<Integer> al1 = new ArrayList<Integer>(Arrays.asList(2,3));
		
		func(al, al1);
		
		int[] a = {1,2,3,4,5};
		
		int[] b = {1,2,5};
		
		funcAnother(a, b);
		
		//**************************************************************************
		
		
		//NOT WORKING
		ArrayList<RemoveOneArrayFromAnotherArray> al2 = new ArrayList<RemoveOneArrayFromAnotherArray>();
		ArrayList<RemoveOneArrayFromAnotherArray> al3 = new ArrayList<RemoveOneArrayFromAnotherArray>();
		
		al2.add(new RemoveOneArrayFromAnotherArray("i", 1));
		al2.add(new RemoveOneArrayFromAnotherArray("you", 2));
		al2.add(new RemoveOneArrayFromAnotherArray("them", 3));
		
		al3.add(new RemoveOneArrayFromAnotherArray("them", 3));
		al3.add(new RemoveOneArrayFromAnotherArray("you", 2));
		
		System.out.println(al2);
		
		System.out.println(al3);
		
		al2.removeAll(al3);
		
		for(RemoveOneArrayFromAnotherArray obj: al2) {
			
			System.out.println(obj);
			
		}
		
		
		
	}

}
