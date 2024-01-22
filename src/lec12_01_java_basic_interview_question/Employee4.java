package lec12_01_java_basic_interview_question;

// Can you call a non-static (global) variable or method inside the main method (without creating object)?
// Ans: No, a non static variable or method can't be called inside static method
// FYI: main method is static in nature
// How you can resolve that issue?
// By making the variable static

public class Employee4 {
	public static String empName = "Mohammad Sharkar";
	public static int empId = 2188458;
	public static char gender = 'M';
	public static boolean fullTimeEmployee = false;
	
	public static void employee() {
		System.out.println("Employee Name: " + empName + ", Employee Id: " + empId + ", Employee Gender: " + gender
				+ " and Full time Employee? Ans: " + fullTimeEmployee);
	}	

	public static void main(String[] args) {
		employee();
	}

}
