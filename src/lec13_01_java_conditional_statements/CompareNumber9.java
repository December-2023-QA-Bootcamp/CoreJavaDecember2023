package lec13_01_java_conditional_statements;

public class CompareNumber9 {
	public static void main(String[] args) {
		/*
		int age1 = 18;

		if (age1 < 18) {
			System.out.println("You can't vote");
		} else {
			System.out.println("You are a voter, you can vote");
		}
		*/
		
		int age = 18;
		String outcome = (age < 18) ? "You can't vote" : "You are a voter, you can vote";
		System.out.println(outcome);
		
		// High level, developers generally use
		// Just remember the name of the condition -- 'Short-hand If...Else condition' Or 'Ternary Operator'
		
		
		int val = 7178624;
		
		String oddOrEven = (val % 2 == 0) ? "Even Number" : "Odd Number" ;
		System.out.println(oddOrEven);
		
		
	}

}
