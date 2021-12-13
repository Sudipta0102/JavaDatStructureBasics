package arrays;

import java.util.Arrays;

public class ConverByteArrayToHexString {
	
	public static void func(byte[] bArr) {
		
		String s = String.format("%02X", bArr[0]);
		
		System.out.println(s);
		
		
		for(byte b: bArr) {
			
			String s1 = String.format("%02X", b);
			
			System.out.print(s1+" ");
		}
	}

	public static void main(String[] args) {

		byte[] bArr = {23,45,12,23};
		
		System.out.println(Arrays.toString(bArr));

		func(bArr);
		
	}

}
