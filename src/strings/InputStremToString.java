package strings;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputStremToString {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the file path:");
		String fName = s.nextLine();
		
		//creating a file object
		File f = new File(fName);
		try {
			//creating a inputstream object
			InputStream is = new FileInputStream(f);
			
			//creating a inputstreamreader object
			InputStreamReader isr = new InputStreamReader(is);
			
			//creating a character array
			char cArr[] = new char[(int)f.length()];
			
			//reading contents of the reader
			isr.read(cArr);
			
			//converting a character array to a string
			String contents = new String(cArr);
			System.out.println(contents);
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
	}

}
