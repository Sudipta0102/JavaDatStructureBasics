package strings;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintStringFromFileWithPattern {
	
	public static void func(String str) throws IOException {
		
		try {
			//File Writer
			FileWriter writer = new FileWriter("test.txt");
			
			writer.write(str);
			writer.close();
			
			System.out.println("successfully writing in a file");
		}
		catch(IOException e) {
			
			System.out.println("an error writing");
			e.printStackTrace();
		}
		
		//FileReader
		BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
		
		
		Pattern p = Pattern.compile("\\w+");
		
		System.out.println("Matched Content:");
		
		//For each line of input, try matching the pattern
		String line;
		
		while ((line = reader.readLine()) != null) {
			
			Matcher match = p.matcher(line);
			
			while(match.find()) {
				
				System.out.println(match.group(0));
			}
			
		}
		
	}
	

	public static void main(String[] args) throws IOException {
	
		
		func("Writing in a test file");

	}

}
