package arrays;

import java.util.Arrays;

public class ConvertByteArrayToHexadecimal {

	public static void func(int num) {

		//int num = 9;

		int rem = 0;

		String s = "";

		if(num==0) {
			
			System.out.println(num);
			return;
		}
		
		while (num > 0) {
			
			
			rem = num%16;
			
			if(rem>=10 && rem<=15) {
				
				//char ch = (char)('A'+(rem-10));
			
				//System.out.println(ch);
				
				if(s.isEmpty())
				
					s = s+ (char)('A'+(rem-10)) ;
				else 				
				
					s = (char)('A'+(rem-10)) + s;
				
				//System.out.println(s);
			
			}
			
			else if(rem<10 ) {
				
				s = rem + s;
				
			}
			
			
			num = num/16;
			
			//System.out.println(num);
			
			//System.out.println("--------");
		}

		System.out.println(s);
	}

	public static void funcAnother(byte[] bArr) {
		
		for(int i=0;i<bArr.length;i++) {
			
			 String s =  String.format("%02X", bArr[i]);
			
			 System.out.print(s + " ");
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {

		byte[] bArr = { 31, 54, 23, 15, 127 };

		//System.out.println(Arrays.toString(bArr));

		func(255);
		
		func(254);
		
		func(253);
		//System.out.println(8/16);
		
		//funcAnother(bArr);
		
		
		//int u = 1;
		
		//System.out.println((char)('A'+ u));
	}

}
