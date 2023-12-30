package lec06_01_java_different_type_of_methods;

// What we learn from here?
// we can call a method inside another method [line 19]

public class D_learningReturnTypeMethodWhereMethodInsideMethod {
	// Global variable or class variable
	public int a = 43;
	public int b = 21;
	
	protected String firstName = "Mohammad";
	String lastName = "Sharkar"; // default type variable
	
	// return type method
	// return keyword should be the last statement of return type method
	public int subtraction() {
		int total = a-b;
		System.out.println("Subtraction of a and b is: " + total);
		myName();
		return total;
	}
	
	public String myName() {
		String name = firstName + " " + lastName;
		System.out.println("My Name: " + name);
		return name;
	}

}
