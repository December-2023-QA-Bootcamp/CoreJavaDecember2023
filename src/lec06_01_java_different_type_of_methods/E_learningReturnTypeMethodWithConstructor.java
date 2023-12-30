package lec06_01_java_different_type_of_methods;

// What we learn from here?
// method can be called inside Constructor

public class E_learningReturnTypeMethodWithConstructor {
	// Global variable or class variable
	public int a = 43;
	public int b = 21;
	
	protected String firstName = "Mohammad";
	String lastName = "Sharkar"; // default type variable
	
	public E_learningReturnTypeMethodWithConstructor () {
		System.out.println("I am coming from Constructor body\n");
		subtraction();
		myName();
		// We can can call methods inside Constructor.
		// Why we put methods inside constructor?
		// if a class is instantiated [when object is created], constructor is initialized, 
		// so if we put something need us during instantiation, then it helps
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
	
	
	

}
