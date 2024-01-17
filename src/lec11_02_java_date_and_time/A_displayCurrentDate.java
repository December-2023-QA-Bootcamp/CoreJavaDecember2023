package lec11_02_java_date_and_time;

// This package will not be in the quiz, hw, this is not asked in the interview

import java.time.LocalDate;
import java.time.LocalTime;

public class A_displayCurrentDate {
	public static void main(String[] args) {
		// Local Date
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		// Local Time
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);

	}

}
