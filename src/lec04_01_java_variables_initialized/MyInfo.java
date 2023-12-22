package lec04_01_java_variables_initialized;

public class MyInfo {
	// variables initialized
	public String myName = "Tofael";
	public byte myAge = 127; 
	public short myApartmentRent = 32767;
	public int myYearlySalary = 238479823;  
	public long myBankBalance = 6587675642376482642l; 
	public float myHeight = 1.65434f;
	public double myGrade = 3.6876643574836;
	public char myGender = 'M';
	public boolean usCitizen = false;
	
	// This Constructor is declared here
	public MyInfo() {
		System.out.println(":----- This is all about Myself -----:");
	}

	// method implemented
	// method name can be same as class name, but in lower case
	// but, this is not mandatory to make a method name as class name
	public void myInfo() {
		// Can I use/call variable inside method body? Ans: Yes
		// Line 26-31 is used to explain line 32
		System.out.println(myName);
		System.out.println("-------------------------");
		System.out.println("My Name: " + myName);
		System.out.println("-------------------------");
		System.out.println("My Name: " + myName + "\nMy Age: " + myAge);
		System.out.println("-------------------------");
		System.out.println("My Name: " + myName + "\nMy Age: " + myAge + "\nMy Apartment Rent: " + myApartmentRent
				+ "\nYearly Salary: " + myYearlySalary + "\nMy Bank Balance: " + myBankBalance + "\nSex: " + myGender
				+ "\nMy Height: " + myHeight + "\nMy Grade: " + myGrade + "\nAm I US Citizen? Ans: " + usCitizen);		
	
		newYork(); // a method can be also called inside another method
	}
	
	public void newYork() {
		System.out.println("I am newYork method");
	}
	
		
}
