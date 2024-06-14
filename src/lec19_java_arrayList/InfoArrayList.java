package lec19_java_arrayList;

/*
Array:
Array is static in size
Array index can be updated
if we need to increase the size, then we have to "creat a new Array" by Arrays.copyOf(previous Array, New Size)
To Sort an Array: Arrays.sort(a); 
To see an Array: Arrays.toString(a)
Array vs Arrays:
Arrays is a class use to manipulate an Array


MultiDimensional Array:
When Arrays are present inside another Array
String [][] multiDimensionalArray = new String [][] {array1, array2};
To see it: Arrays.deepToString(multiDimensionalArray)



ArrayList:

add() is used to add an element
get() is used to get an element from a specific index
size() is used to know the size, for Array length properties, for String length()
size is dynamic, initial capacity (ic) is 10, then increased by formula: (ic*3/2)+1


ar.get(ar.size() - 1) --> last index of an Array

add("New York");
add(3, "Montana"); -- Replace
set(3, "Florida"); -- set method remove and replace index and it's content 
remove() --> remove from a specific position


add() vs add(3, "A") vs set(3, "B") vs remove(3)

sorting ArrayList: Collections.sort(list); // Arrays.sort() for sorting Array
Very very important Info: sort() show exception when null is present


What is the difference between List and Set? or when we use List, when Set*****

       List				                             Set
------------------------------------------------------------------
      Ordered                  		      Unordered
  Duplicate allowed                     Duplicate not allowed




What is the difference between the Array and ArrayList?
Array length is fixed but arraylist is dynamic [not fixed].
Array can store primitive variables and objects but arraylist can store only Objects.
Array members are accessed using [], but ArrayList has a set of methods to access elements and modify them as because arraylist is collection of framework in java.


What is the difference between ArrayList and LinkedList ? *******

Feature                                 ArrayList                              LinkedList
Searching                                Faster                                    slower
Insertion/deletion                    Slower                                   faster
Direction                                One way                               Both way
Based on                                 Index                                     Node




Feature                                    Iterator                            ListIterator
Traverse (travel/iterate)       Through List and Set              Through List Only
Direction                               Forward                        forward and backward


3 methods in Iterator: next(), hasNext(), remove()
9 methods in ListIterator: next(), hasNext(), remove(), add(), previous(), hasPrevious(), previousIndex(), nextIndex(), set(). *********

while traversing a list We cannot obtain indexes    We can obtain indexes
     			cannot add element  		 can add element
        cannot replace the existing element                 

                                                                         can replace the last element

 */





public class InfoArrayList {

}
