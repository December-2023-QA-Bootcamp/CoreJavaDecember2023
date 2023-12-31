package lec08_02_Java_oop_abstraction;

// Interface names starts with UpperCase 
// They follow Camel case or Snake case pattern.
// CamelCase or Snake_case feature considered from second word, not from first word
// CamelCase example for an Interface --> CarToyota
// Snake_case example for an Interface --> Car_toyota

// Interview Question
// What is Interface?
// Interface is a Blueprint of the Class.
// An interface is a collection of methods that are defined (declared) but not implemented. 

public interface Car {
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
	public String brake();
}

// I am not initializing interface today
// Also not showing a relation between class and Interface

// What is the summary?
// method declared means: no method body [no curly braces]
// method implemented means: have method body [have curly braces]
