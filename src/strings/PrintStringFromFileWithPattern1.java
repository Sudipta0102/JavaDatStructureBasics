package strings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintStringFromFileWithPattern1 {
	
	public static void func() throws IOException {
		
		//File Writer
		FileWriter writer = new FileWriter("test1.txt");
		
		writer.write("this is for15 test purpose 1234");
		
		writer.close();
		
		System.out.println("wrote in the file");
		
		//File reader
		BufferedReader reader = new BufferedReader(new FileReader("test1.txt"));
		
		Pattern pattern = Pattern.compile("\\d");
		
		String line ;
		
		while((line = reader.readLine())!=null) {
			
			Matcher matcher = pattern.matcher(line);
			
			while(matcher.find()) {
			
				System.out.println(matcher.group(0));
			
			}
		}
		
		
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		func();
		
	}

}
