package lec06_01_java_different_type_of_methods;

public class F_learningParameterizedMethod {
	// Global variable or class variable
	public int a = 43;
	public int b = 21;
	// If there is parameterized method, we don't need to initialize variables, see line 19
	// something new in line 22
	
	// void type parameterized method
	public void addition(int a, int b) { // a and b is parameter here
		// Inside method, we don't need a relation between variable and parameter like
		// Constructor
		int sum = a + b;
		System.out.println("Addition of a and b is: " + sum);
	}

	// return type parameterized method
	public int subtraction(int c, int d) { // if a method is parameterized, then no need of variables as 'c' and 'd'
		int total = c - d;
		System.out.println("Subtraction of c and d is: " + total);
		return c-d; // we can also write this
	}

	
	public String myName(String firstName, String lastName) { 
		String name = firstName + " " + lastName;
		System.out.println("My Name: " + name); 
		return name; 
	}
	
	
	// parameterized method can be void type or return type
	 

}
