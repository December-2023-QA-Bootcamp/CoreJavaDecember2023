package lec17_02_java_array;

import java.util.Arrays;

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
	 // length preserve the size of an array, length is not a method or field or variable,
	 // rather length is a parameter/properties
	 // length() is a method of String
	 
	//or	without  new String [] 
	System.out.println("\n------------------------------------------------------------------------");
	String [] allPresident = {"Biden", "Trump", "Obama", "Bush Jr", "Clinton", "Bush Sr"};  
	System.out.println(allPresident.length); 
	System.out.println(allPresident[5]);
    
	System.out.println("\n------------------------------------------------------------------------");
	// char type
	char [] sex = {'M', 'M', 'M', 'F', 'M'};
	System.out.println(sex[3]);
	System.out.println(sex.length);
	
	System.out.println("\n------------------------------------------------------------------------");
	// or	without new int [] 
	int [] age = {23, 54, 12, 66, 88, 23, 80, 43};
	System.out.println(age.length);
	System.out.println(age[3]);
	System.out.println(age[0]);
	// System.out.println(age[8]);
	// System.out.println(age[-1]); // same outcome as above line
	
	// interview question: What is the exception you got if Array is out of range?
	// Ans: ArrayIndexOutOfBoundsException 
	
	// int [] a = {5, 15, 50, 0, 56};
	// a.length value is 5;
	// a[0]=5, a[1]=15, a[2]=50, a[3]=0, a[4]=56
	// a[4]=56
	// a[5-1]=56
	// a[a.length-1]=56
	
	// For example
	// a.length = 100;
	// a[99] = a[100-1] = a[a.length-1]
	// This is a formula: last index is a[a.length-1]
	// This is a formula: second last index is a[a.length-2]
	// This is a formula: third last index is a[a.length-3]  and so on .........
	// important interview question: How to find (what is the formula) the value for last index from an Array?
	System.out.println("\nPrinting the last number of the Array: " + age[age.length - 1]); 
    
	// Que: how can you find the second last index from an array if the array name is a?
	// Ans: a[a.length - 2])
	
	// very very important -->  toString(a) method
	// no need to memorize
	//	Returns a string representation of the contents of the specified array. The string representation consists 
	// of a list of the array's elements, enclosed in square brackets ("[]"). Adjacent elements are separated by the
	// characters ", " (a comma followed by a space). Elements are converted to strings as by String.valueOf(int). 
	
	// important
	// Array vs Arrays, Arrays is a class which is used to manipulate the Array
	// What will happen if you directly print by Array name or array object? Ans: you will get the "Array ID"
	System.out.println(age);
	// solution below
	System.out.println(Arrays.toString(age));
    
	// Just FYI
	int [] b = new int [0]; // 0 elements, no elements there, also called null
	// System.out.println(b[0]); // newly added
	System.out.println("To find an Array when size is Null: " + Arrays.toString(b)); // You will find Empty Array
	System.out.println(b.length);
	
	
	// You can skip below
	System.out.println("\n------------------------------------------------------------------------");
	// NOT IMPORTANT
	System.out.println("\nPrinting Array ID: " + age); // Array ID
	// NOT IMPORTANT
	System.out.println("\nPrinting hashCode of the Array, represented by data: " + Arrays.hashCode(age));
	// hashCode of the Array used for representation of array by data	
	// java.util.Arrays Class --> This class contains various methods for manipulating Array (such as sorting and searching).
	// NOT IMPORTANT
	System.out.println("\nPrinting the index position of the value form the ref: " + Arrays.binarySearch(age, 66)); // which index is 66?
	// here a is the name of the array, 66 is the value checking the index number
	// binary search to get the index position of the value from the ref
	System.out.println("\nPrinting the index position of the value form the ref: " + Arrays.binarySearch(age, 3)); //TODO WHY -1?
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
