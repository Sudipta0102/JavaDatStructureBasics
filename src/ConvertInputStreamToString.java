import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;



public class ConvertInputStreamToString {

	public static void main(String[] args) {
		
		/*
		 * 1. InputStreamReader class
		 * 2. BufferedReader class
		 * 3. Scanner class
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the file path: ");
		String filename = scanner.nextLine();
		
		//creating a file object
		File file = new File(filename);
		try {
			
			//creating an inputstream object
			InputStream is = new FileInputStream(file);
			
			//creating an inputstream reader object
			InputStreamReader isr = new InputStreamReader(is);
			
			//creating a character array
			char charArray[] = new char[(int)file.length()];
			
			long x = file.length();
			
			System.out.println(x);
			
			//reading the contents of the reader
			isr.read(charArray);
			
			//converting the character array to a string
			String contents = new String(charArray);
			System.out.println(contents);			
		}
		catch (IOException e) {
			System.out.println(e);
		}		
	}
	
	//C:\Users\Baban\Desktop\chooseLife.txt
}
