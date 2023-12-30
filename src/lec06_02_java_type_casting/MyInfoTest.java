package lec06_02_java_type_casting;

public class MyInfoTest {

	public static void main(String[] args) {
		// parameterized Constructor Initialized
		// you will not use it for coding, just extra information
		// In Parameterized Constructor, the system can't recognize byte and short type, so we need to do casting for that
		MyInfo tofael = new MyInfo("Tofael", (byte)99, (short)20000, 7378623, 7368278423l, 1.654f, 3.76572827, 'M', true);
		
		
	}

}
