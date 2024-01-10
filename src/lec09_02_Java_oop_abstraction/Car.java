package lec09_02_Java_oop_abstraction;

// Interface names starts with UpperCase 
// They follow Camel case or Snake case pattern.
// CamelCase or Snake_case feature considered from second word, not from first word
// CamelCase example for an Interface --> CarToyota
// Snake_case example for an Interface --> Car_toyota

// Interview Question
// What is Interface?
// Interface is a Blueprint of the Class.
// An interface is a collection of methods that are defined (declared) but not implemented. 

// An Interface can't inherit a regular class or an abstract class by extends keyword
// An Interface can inherit more than one Interface (separated by comma) by extends keyword

public interface Car extends Taxi, Truck {
	// Global variable
	// Inside Interface, variable can not be declared, see line 17
	// public int year;
	
	// Interview question: Can we declare variables inside Interface? 
	// No, we must have to initialize
	// what is the feature of variable that can be used inside Interface?
	// the variables inside Interface are final and static in nature.
	 public static final int invented = 1860;
	// final means you can't change it
	// static means -- that property is a personal property of the Interface / class, 
	// other Class or Interface can't use it
	
	// Interview question: Does Interfaces have constructors?
	// Ans: No, Interfaces cannot have constructors
	/*
	public Car () {
		
	}
	*/

	 // Interface doesn't have method body like classes
	// and here method is declared inside Interface body, 
	// method declared, but not implemented
	// This is not mandatory to put abstract keyword with the abstract method inside Interface
	// called abstract method (when method is declared)
	public void start();
	public abstract void stop();
	// this is a return type abstract method, but abstract keyword is not mandatory for methods inside Interface
	// return type abstract method can also be created inside the Interface
	public String brake(String brakeName); 
	
	// we can also create parameterized method, Please see line 47 now
	
	// from Java 1.8, JAVA implemented static and default type method in interface 
	// which are implemented in nature
	// important interview question
	// These below 2 method can be return type, can be parameterized type 
	
	// This default is not access modifier
	public default void honk() {
		System.out.println("This Honk feature came from Car Interface");
	}
	
	public static void gear() {
		System.out.println("This Gear feature is from Car Interface");
	}
	
	
	
	
	
	
}

// I am not initializing interface today
// Also not showing a relation between class and Interface

// What is the summary?
// method declared means: no method body [no curly braces]
// method implemented means: have method body [have curly braces]
