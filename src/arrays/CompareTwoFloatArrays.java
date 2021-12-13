package arrays;

import java.util.Arrays;

public class CompareTwoFloatArrays {
	
	public static void func(float[] a, float[] b) {
		
		int flag = 0;
		
		if(a.length != b.length) {
			
			System.out.println("Not Equal");
			return;
			
		}
			
		for(int i=0;i<a.length;i++) {
			if(a[i]!=b[i]) {
				
				flag =1;
				System.out.println("Not equal");
				break;
				
			}
			
		}
		
		if(flag == 0) {
			
			System.out.println("Arrays are same");
		}
	}

	public static void main(String[] args) {

		float[] floatV1 = new float[] { 3.1f, 7.5f, 8.3f };
		float[] floatV2 = new float[] { 8.3f, 8.8f, 9.2f };
		float[] floatV3 = new float[] { 3.1f, 7.5f, 8.3f };
		float[] floatV4 = new float[] { 3.2f, 5.5f, 5.3f };
		
		func(floatV1, floatV2);
		func(floatV1, floatV3);
		func(floatV1, floatV4);
		
		// Second way would be Arrays.equals()
		System.out.println(Arrays.equals(floatV1, floatV3));
		
		
	}

}
