package lec03_java_variables;

public class MyInfo {
	// This is a class body
	// A class body contains first: variables, second: Constructor, third: methods
	
	// String itself is a class, represents for String type variable here
	// String is not a pure primitive data type, important interview question
	public String myName = "Tofael";
	// String type values are always inside double quotation
	
	// primitive data type - 8 type
	// byte, short, int, long are used for complete/solid number
	public byte myAge = 127; // -128 to 127
	public short myApartmentRent = 32767; // –32,768 to 32,767
	public int myYearlySalary = 238479823; // –2,147,483,648 to 2,147,483, 647  
	public long myBankBalance = 6587675642376482642l; // –9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
	// we must have to use lower case L (l), at the end of long type value
	// Long can accept int range and no need of l, but when you cross the range of int, you must have to use l
	
	// float and double are used for not a complete number [a number with decimal]
	public float myHeight = 1.65434f;
	// we must have to use lower case f, at the end of float value
	public double myGrade = 3.6876643574836;
	// Above 6 types are used for number, values are reperesnted bu no quotation
	// Mostly int is used for complete number and float for decimal number
	
	// char type variable value have single character, inside single the quotation, and in upper case
	public char myGender = 'M';
	
	// boolean type variable values are with no quotation. Represented by 'true' or 'false' in lower case only	
	public boolean usCitizen = false;
	
	// How to create a Constructor?
	// Constructor name is same as 'Class name', so starts with Upper Case 
	// and follow camel case or snake case feature
	// This Constructor is declared here
	public MyInfo() {
		// Constructor Body
		System.out.println("I am a Constructor from MyInfo Class");
	}
	
		
}
