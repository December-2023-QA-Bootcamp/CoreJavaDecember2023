package lec06_03_Java_Interface;

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
	// Interface doesn't have method body like classes
	// and here method is declared inside Interface body, 
	// method declared, but not implemented
	public void start();
	public void stop();
	public void brake();

}

// What is the summary?
// method declared means: no method body [no curly braces]
// method implemented means: have method body [have curly braces]
