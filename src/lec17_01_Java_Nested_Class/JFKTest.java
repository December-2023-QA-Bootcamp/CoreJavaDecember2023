package lec17_01_Java_Nested_Class;

import lec17_01_Java_Nested_Class.JFK2.TerminalOne;

public class JFKTest {

	public static void main(String[] args) {
		System.out.println("\n-------------- JFK01 --------------");
		JFK1 jfk1 = new JFK1();
		jfk1.welcome();  // outer class method is initialized
		// The below method doesn't work
		// jfk1.domestic(); // Inner class method
				
		// Below line is not ok, because TrminalOne is an inner class, inner class can't be instantiated here
		// Creating object from inner class is not possible here
		// TerminalOne t1 = new TerminalOne();
		
		// How a outer class object will access the methods of inner class?
		// object of outer class dot object of inner class dot properties/methods of the inner class
		jfk1.t1.destination();  // inner class method is initialized
		jfk1.t2.domestic();
		jfk1.t4.middleEastFlights();
		
		System.out.println("\n-------------- JFK02 --------------\n");
		JFK2 jfk2 = new JFK2();
		jfk2.welcome();
		
		System.out.println("\n----------------------------\n");
		// When a inner class is static, then we can write like JFK2.TerminalFour		
		JFK2.TerminalFour jt01 = new JFK2.TerminalFour();
		// non static method of static inner class
		jt01.middleEastFlights(); 
		// Below one is not ok as Terminal one is not static
		// JFK2.TerminalOne jt02 = new JFK2.TerminalOne();
		
		// static method of static inner class
		JFK2.TerminalFour.asianFlights(); // This is new here
		// If outer class have static inner class, and static inner class have static method
		// you don't need to create object like line 30
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
