package lec06_02_java_type_casting;

public class UseOfNarrowingCasting {
	// mostly used for converting float/double to byte/short/int/long
	public static void main(String[] args) {
		double  myGrade = 3.364768723;
		System.out.println("What is my Grade? Ans: " + myGrade);
		
		// How can you convert a double to an int type?
		// By Narrowing casting
		int myNewGrade = (int)myGrade;
		System.out.println("What is my new Grade in int? Ans: " + myNewGrade);
		
		// How can you convert a double to a byte type?
		// By Narrowing casting
		byte myGradeInByte = (byte)myGrade;
		System.out.println("What is my new Grade in byte? Ans: " + myGradeInByte);

	}

}
