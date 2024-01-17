package lec11_02_java_date_and_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class D_formattedDateAndTime {

	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Before Formatting :::::> " + localDateTime);
		
		/*
	    The ofPattern() method accepts all sorts of values, if you want to display the date and time in a different format
	    yyyy-MM-dd 
	    dd/MM/yyyy
	    dd-MMM-yyyy
	    E, MMM dd, yyyy [Example: Thu Nov 22, 2018]
	    E --> Day, HH is used for Military time
	    */
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMddhhmmss");
		String formattedDateAndTime = localDateTime.format(dateTimeFormatter);
		System.out.println("After Formatting :::::>" + formattedDateAndTime);
		
		

	}

}
