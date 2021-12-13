package strings;

import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConvertStringTodate {
	
	//using Instant class in java.time
	public static void func(String str) {
		
		//create an instant timestamp object
		Instant timestamp  = null;
		
		//parse the string to date
		timestamp = Instant.parse(str);
		
		
		System.out.println(timestamp);
	}

	public static void funcAnother(String str) {
		
		//set the format using DateTimeFormatter
		DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM, yyyy");
		
		//Convert the string to date using LocalDate
		LocalDate date = LocalDate.parse(str, format);
		
		System.out.println(date);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		func("2018-10-28T15:23:01Z");
		
		//func("aa");//DateTimeParseException
		
		funcAnother("28 October, 2018");
	}

}
