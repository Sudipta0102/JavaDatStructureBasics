package arrays;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class ByteArrayToFile {
	
	public static void func(byte[] a) {
		
		File file = new File("byteArr.txt");
		
		try {
		
			FileOutputStream fos = new FileOutputStream(file);
		
			fos.write(a);
		
			System.out.println("byte array inserted");
			
			fos.close();
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {

		byte[] b = {23,24,25,26,27};
		
		//System.out.println(Arrays.toString(b));
		
		//String str = "I am You";
	
		//byte[] ba = str.getBytes();
	
		byte ba = 27;
		
		byte[] bb = Byte.toString(ba).getBytes();
		
		func(bb);
	}

}
