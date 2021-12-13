package strings;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppndStringInExistingFile {
	
	public static void CreateAfile(String loc) {
		
		try {
		
			File file = new File(loc);
		
			FileWriter writer = new FileWriter(file);
		
			writer.write("written");
			
			writer.close();
			
			System.out.println("written...");
		} catch (IOException e) {
			
			e.printStackTrace();
		
		}
		
		
	}

	public static void func(String appenndedText) {
		
		try {
			FileWriter writer = new FileWriter("aFile.txt", true);
			
			writer.append(appenndedText);
			
			writer.close();
			
			System.out.println("appended some text");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		//CreateAfile("aFile.txt");

		func("\nWritten again");
	}

}
