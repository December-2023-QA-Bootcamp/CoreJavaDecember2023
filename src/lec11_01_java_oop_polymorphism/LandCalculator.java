package lec11_01_java_oop_polymorphism;

public class LandCalculator {
	
	// void type non parameterized method (1) is implemented
	// method name can be same as class name but in lower case
	public void landCalculator() {
		System.out.println("This is from void type method from Local Calculator");
	}
	
	// void type parameterized method (2) implemented	
	public void landCalculator(int a, int b) {
		int total1 = a + b;
		System.out.println("Total area from Local Calculator: " + total1);
	}
	
	// return type parameterized method (3) implemented
	// if you write like (int c, int b, int a) in a separate method or like (int d, int e, int f) , it will not work
	// same variable type is the problem, how many variables, this is not an issue
	// it allows the same number of variable, if variables type are different as parameter in a different combination
	public int landCalculator(int a, int b, int c) {
		int total2 = a + b+c;
		System.out.println("Total area from Local Calculator: " + total2);
		return total2;
	}
	
	// return type parameterized method (4) implemented
	// line 21 vs 29, although number of parameter same, method name same, but parameter type is different
	// same number of parameter, same type of parameter in the same position -- not allowed
	// Different position is ok
	public int landCalculator(float d, String e, int f) {
		int total3 = (int) d + Integer.parseInt(e) + f; // This formula is not a part of polymorphism, we just convert them to int
		System.out.println("Total area from Local Calculator: " + total3);
		return total3;
	}
	
	// return type parameterized method (5) implemented
	public int landCalculator(String e, float d, int f) {
		int total4 = Integer.parseInt(e) + (int) d +  f;
		System.out.println("Total area from Local Calculator: " + total4);
		return total4;
	}
	
	// Return type parameterized method (6) which is final type and implemented
	// Also called final method, final method can't be changed
	// Final type of method can be overloaded -- important interview question
	// it is not mandatory the final method to be return type, it can be void type too
	public final int landCalculator (int a, int b, int c, int d) {
		int total5 = a+b+c+d; // local variable
		System.out.println("Total area from Local Calculator: " + total5);
		return total5;
	}
	
	// Static type Method (7) implemented
	// Static method can be overloaded -- important interview question
	// because static is a local member method of a class
	public static void landCalculator (int a, int b, int c, int d, int e) {
		int total7 = a+b+c+d+e; // local variable
		System.out.println("Total area from Local Calculator: " + total7);
	}
	
	
	/*
	 Summary:
	 for method overloading, 
	 method can be void type or return type
	 Parameterized or non parameterized
	 count number of parameter, if parameter number is same, then see the sequence of data type in parameter
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
