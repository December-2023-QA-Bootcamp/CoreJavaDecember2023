package lec01_java_basic;

// We can create more than one package inside the src file [src is called source file]
// We can create more than one class inside a package

// here public --> access modifier, class --> type, HelloWorld --> is the name of the class
// The system create a class for us, we didn't type it

public class HelloWorld {

	// main method line 19
	// This is the entry point of the Java
	// This is used to execute the code
	// If it is absent, no execution of code, very common mistake
	// This is a system generated method, name is 'main'
	// What is the shortcut of creating a main method? Ans: Type 'main' and then press Enter button.
	// All the execution come from main method
	// main method is used 'only once' inside a class [try to create a main method inside/outside the class]
	public static void main(String[] args) {
		// you have to type 'syso' to print something, and then press Enter
		// below line is also system generated printing command, used for printing something
		System.out.println("Hello World!"); 
		// common mistake: we forgot to put double quotation inside parenthesis, 
		// For execution: We have to save the code (Manually by clicking save/save all button on the top left)
		// Windows user: keyboard shortcut: save (ctrl+s), saveAll (ctrl+shift+s)
		// Mac user: keyboard shortcut: save (command+s), saveAll (command+shift+s)
	}

}

// This part is called Editor
// Below part where you get the outcome as "Hello World!" is called Console

// How to Execute/Run the code? 
// 1) Green play button
// 2) right click on Editor -- then 'run as' -- 'java application' 
// 3) from the top of the page from 'Run' -- then 'run as' -- 'java application' 
// 4) go to the class on left and do the right click -- then 'run as' -- 'java application' 

