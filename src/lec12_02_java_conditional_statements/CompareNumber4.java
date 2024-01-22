package lec12_02_java_conditional_statements;

import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

/*
Java Logical Operators: 
Logical operators are used to determine the logic between variables or values. example below:

&&	 Logical and operator (Returns true if both statements are true, x < 5 &&  y < 10)
If both condition is true, the condition body will be executed
If both condition is false, the condition body will not be executed
If one condition is true and one false, the condition body will not be executed

|| 		Logical or operator (Returns true if one of the statements is true, x < 5 || y < 4)
If both condition is true, the condition body will be executed
If both condition is false, the condition body will not be executed
If one condition is true and one false, the condition body will be executed

!     Logical not operator [Reverse the result, returns false if the result inside is true, (!(x < 5 && y < 10))] 

 */

// Use of logical and operator '&&'
// Use of logical not '!' -- at line 54
// If you understand this class, you understand all of today's content

public class CompareNumber4 {
	public static void main(String[] args) {
		System.out.println("---: Please Put the values in the console :---");
		Scanner scanner = new Scanner(System.in);
		int val1 = scanner.nextInt();
		int val2 = scanner.nextInt();
		
		if (val1 % 2 == 0 && val1 < val2) {
			System.out.println(val1 + " is an even number and " + val1 + " smaller than " + val2);
		} else if (val1 % 2 == 0 && val1 > val2) {
			System.out.println(val1 + " is an even number and " + val1 + " greater than " + val2);
		} else if (val1 % 2 == 0 && val1 == val2) {
			System.out.println(val1 + " is an even number and " + val1 + " is equal to " + val2);
		} else if (val1 % 2 == 0 && val1 >= val2) {
			System.out.println(val1+" is an Even Number and " + val1 + " is greater than or equal to " + val2);
		} else if (val1 % 2 == 0 && val1 <= val2) {
			System.out.println(val1+" is an Even Number and " + val1 + " is smaller than or equal to " + val2);
		} else if (val1 % 2 == 1 && val1 < val2) {
			System.out.println(val1 + " is an odd number and " + val1 + " smaller than " + val2);
		} else if (val1 % 2 == 1 && val1 > val2) {
			System.out.println(val1 + " is an odd number and " + val1 + " greater than " + val2);
		} else if (val1 % 2 == 1 && val1 == val2) {
			System.out.println(val1 + " is an odd number and " + val1 + " is equal to " + val2);
		} else if (val1 % 2 == 1 && val1 >= val2) {
			System.out.println(val1+" is an odd Number and " + val1 + " is greater than or equal to " + val2);
		} else if (!(val1 % 2 == 1 && val1 <= val2)) {
			System.out.println(val1+" is not an odd Number [Even Number] and " + val1 + " is not smaller than or not equal to " + val2);
		} else {
			System.out.println("The system failed to execute your outcome");
		}
		scanner.close();		
	}

}

