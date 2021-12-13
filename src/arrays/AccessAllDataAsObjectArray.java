package arrays;

import java.util.Arrays;

public class AccessAllDataAsObjectArray {
	
	public static void func(int[] iArr) {
		
		Object[] oArr = new Object[iArr.length];
		
		for(int i=0;i<iArr.length;i++) {
			
			oArr[i] = iArr[i];
			
		}
		
		System.out.println(Arrays.toString(oArr));
		
	}
	
	private int id;
	private String name;
	
	public AccessAllDataAsObjectArray(int id, String name) {
		
		this.id = id;
		this.name = name;
		

	}
	
	
	public void display() {
		
		System.out.println(id + " : "+ name);
			
	}

	public static void main(String[] args) {

		int[] iArr = {1,2,3,4,5};
		
		func(iArr);
	
		System.out.println("-----------");
		
		AccessAllDataAsObjectArray[] oArr = new AccessAllDataAsObjectArray[2];
		
		oArr[0] = new AccessAllDataAsObjectArray(1,"I");
		oArr[1] = new AccessAllDataAsObjectArray(2,"You");
		
		for(int i=0;i<oArr.length;i++) {
			
			oArr[i].display();
			
		}

	}

}
