package lec15_02_java_array;

// What is an Array?
// An array is a collection of items of same data type stored at contiguous memory locations. 

public class UseOfArray01 {

	public static void main(String[] args) {
	// Generally every value is assigned to a variable name, ut in Array, a set of value present under one name
    System.out.println("------------------------------------------------------------------------");
    String val1 = "Biden";
    String val2 = "Trump";
    String val3 = "Obama";
    String val4 = "Bush Jr";
    
    // Array
	// same data type or a cluster of data present
	// How to write an Array: first data type, then [], it is called container, the president (OBJECT) is the name of Array, 
	// [5] represent total 5 data is present
	// Array is static [fixed number of data], [interview question]
        
    String [] president = new String [5];  
    
    president [0] = "Biden";
    president [1] = "Trump";
    president [2] = "Obama";
    
    president [4] = "Clinton";
    
    System.out.println(president.length);
    System.out.println(president[2]);    
    System.out.println(president[3]);    
    // System.out.println(president[5]);    //  java.lang.ArrayIndexOutOfBoundsException
    
	 // or we can write this way, called "literal representation" of an Array
	 System.out.println("\n------------------------------------------------------------------------");
	 String [] presidents =  new String [] {"Biden", "Trump", "Obama", "Bush Jr", "Clinton", "Bush Sr"};
	 System.out.println(presidents[1]);
	 System.out.println(presidents.length);
	 //important interview question: length () vs length
	 // or how can you get the size of a String and Array?
	 // length is a property, length() is a method of String
	 
	//or	without  new String [] 
	System.out.println("\n------------------------------------------------------------------------");
	String [] allPresident = {"Biden", "Trump", "Obama", "Bush Jr", "Clinton", "Bush Sr"};  
	System.out.println(allPresident.length); 
	System.out.println(allPresident[5]);
    
	System.out.println("\n------------------------------------------------------------------------");
	// or	without new int [] 
	int [] age = {23, 54, 12, 66, 88, 23, 80, 43};
	System.out.println(age.length);
	System.out.println(age[3]);
	
	System.out.println("\n------------------------------------------------------------------------");
	// char type
	char [] sex = {'M', 'M', 'M', 'F', 'M'};
	System.out.println(sex[3]);
	System.out.println(sex.length);
	
	// How to write an Array: first data type, then []  container, then array name = data inside curly braces, ended up with semicolon
	
	
   // Student should see Java read and write before come to next class
	
    
    
    
    

	}

}
