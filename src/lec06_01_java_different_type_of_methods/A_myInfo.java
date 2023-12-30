package lec06_01_java_different_type_of_methods;

public class A_myInfo {
	// Class body also contains methods after variables and Constructor
	// Those methods can be either implemented or initialized. (very important info)
	// Inside the class, method can't be declared (very important info)
	// What is method implemented? And: The method who have a body [surrounded by curly braces]
	
	// How to create a method?
	// This is a void type method
	// method name generally starts with lower Case
	// and follow camel case feature or snake case pattern
	// Inside the class, method can't be declared (very important info)
	// method implemented
	public void newYork() {
		System.out.println("I am the newyork method");
	}

	// there can be more than one methods inside a class with different name
	public void city_bus() {
		System.out.println("I am the city_bus method");
	}

	// method name can be same as class name, but in lower case
	// but, this is not mandatory to make a method name as class name
	public void myInfo() {
		System.out.println("I am myInfo method");
	}

	public static void main(String[] args) {
		A_myInfo myInfo = new A_myInfo();
		myInfo.newYork();
		myInfo.city_bus();
		myInfo.myInfo();

	}

}
