package lec06_01_java_different_type_of_methods;

public class C_learningReturnTypeMethod {
	// Global variable or class variable
	public int a = 43;
	public int b = 21;
	
	protected String firstName = "Mohammad";
	String lastName = "Sharkar"; // default type variable
	
	// void type method
	// This method never say what type of parameterized outcome we are getting
	public void addition() {
		int sum = a+b;
		System.out.println(sum);
	}
	
	// return type method
	// return keyword should be the last statement of return type method
	public int subtraction() {
		int total = a-b;
		System.out.println("Subtraction of a and b is: " + total);
		return total;
	}
	
	public String myName() {
		String name = firstName + " " + lastName;
		System.out.println("My Name: " + name);
		return name;
	}
	
	public byte myAge() {
		return 0;
	}
	
	/*
	 * The below info should be memorized, important interview question
	 */
	
	// default value of byte is 0
	// default value of short is 0
	// default value of int is 0
	// default value of long is 0
	
	// default value of float is 0.0
	// default value of double is 0.0
	
	// default value of char [eclipse cannot recognize it, but that is a uni code value]
	// default value of boolean is false
	
	// default value of String is null
	
	
	
	
	
	

}
