package lec13_01_java_conditional_statements;

import java.util.Scanner;

public class CompareNumber2 {
	public static void main(String[] args) {
		System.out.println("---: Please Put the values in the console :---");
		Scanner scanner = new Scanner(System.in);
		int val1 = scanner.nextInt();
		int val2 = scanner.nextInt();
		
		// != represent not logical
		if (val1 != val2) {
			System.out.println(val1 + " is not equal to " + val2);
		} else if (val1 == val2) {
			System.out.println(val1 + " is equal to " + val2);
		} else {
			System.out.println("Please provide a correct value");
		}
		scanner.close();
	}

}

/*
 We can also use Random class to choose any Random Number
 	Random random = new Random();
		int val1 = random.nextInt(1000); // with range
		int val2 = random.nextInt(1000);
 */
