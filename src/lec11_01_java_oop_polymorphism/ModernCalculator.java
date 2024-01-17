package lec11_01_java_oop_polymorphism;

public class ModernCalculator extends LandCalculator {
	
	// void type non parameterized method (1) is implemented
	@Override
	public void landCalculator() {
		System.out.println("This is from void type method from Modern Calculator");
	}
	
	// void type parameterized method (2) implemented	
	@Override
	public void landCalculator(int a, int b) {
		int total1 = a + b + 100;
		System.out.println("Total area from Local Calculator: " + total1);
	}
	
	// return type parameterized method (3) implemented	
	@Override
	public int landCalculator(int a, int b, int c) {
		int total2 = a/2 + b*3 + c + 23;
		System.out.println("Total area from Local Calculator: " + total2);
		return total2;
	}
	
	// return type parameterized method (4) implemented	
	@Override
	public int landCalculator(float d, String e, int f) {
		int total3 = (int) d + Integer.parseInt(e) + f/5;
		System.out.println("Total area from Local Calculator: " + total3);
		return total3;
	}
	
	// return type parameterized method (5) implemented	
	@Override
	public int landCalculator(String e, float d, int f) {
		int total4 = Integer.parseInt(e)*2 + (int) d +  f/2 + 45;
		System.out.println("Total area from Local Calculator: " + total4);
		return total4;
	}
	
	// Return type parameterized method which is final and implemented
	// Final type method cannot be Override -- important interview question
	// Cannot override the final method from LandCalculator	
	
	/*
	@Override
	public final int landCalculator (int a, int b, int c, int d) {
		int total5 = a+b+c+d; // local variable
		System.out.println("Total area from Local Calculator: " + total5);
		return total5;
	}
	*/
	
	// Static type Method (7) implemented
	// important interview question
	// This below method - landCalculator can't override or implemented
	// because static is a local member method of a class
	// So, static method can't be override, if we remove @override it will work as
	// it is considered as the static method of this modern calculator class
	
	/*
	@Override
	public static void landCalculator (int a, int b, int c, int d, int e) {
		int total7 = a+b+c+d+e; // local variable
		System.out.println("Total area from Local Calculator: " + total7);
	}
	*/
	

}
