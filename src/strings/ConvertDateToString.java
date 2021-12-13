package strings;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class ConvertDateToString {
	
	//using DateFormat.format() method
	public static void func(String date) {
		
		//convert the string format to date object
		DateFormat df = new SimpleDateFormat(date);
		
		//get the date using calendar object
		Date today = Calendar.getInstance().getTime();
		
		System.out.println(today.toString());
		
		//convert the date using format() method
		String dateToString = df.format(today);
		
		System.out.println(dateToString);
				
	}

	public static void funcAnother(String date) {
		
		//get the instance from localtime from date
		LocalDate givenDate = LocalDate.parse(date);
		
		
		System.out.println(givenDate.toString().charAt(0));
		
	}
	
	public static void main(String[] args) {

		func("07-27-2020");
		
		funcAnother("07-27-2020");
		

	}

}
