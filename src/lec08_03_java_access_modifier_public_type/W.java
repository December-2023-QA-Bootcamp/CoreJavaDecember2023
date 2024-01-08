package lec08_03_java_access_modifier_public_type;

public class W {
	int a = 60; // class variable or global variable
	int b = 30;

	// public type method
	public void w() {
		int total1 = a + b;
		System.out.println("Addition of a and b is: " + total1);
	}

	
}
