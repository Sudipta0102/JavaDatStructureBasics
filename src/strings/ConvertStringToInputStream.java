package strings;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ConvertStringToInputStream {

	
	
	public static void main(String[] args) throws IOException {
		
		String str = "I am here now";		
		
		// 1. Bytearrayinputstream gives you bytes of the string.
		// 2. Then InputSTream helps you convert into a stream
		InputStream stream = new ByteArrayInputStream(str.getBytes());
		
		
		// buffered reader onject to take the input
		BufferedReader reader = new BufferedReader
				(new InputStreamReader(stream));
		
		
		// printing the stream using the readline
		String s = reader.readLine();
		
		System.out.println("Input Stream:");
		
		System.out.println(s);
		
	}
}
