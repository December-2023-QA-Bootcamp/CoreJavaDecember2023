package lec11_02_java_date_and_time;

// This package will not be in the quiz, hw, this is not asked in the interview

import java.time.LocalDate;

public class B_displayCurrentTime {
	public static void main(String[] args) {
		// Local Date
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);

	}

}
