package lec06_01_java_different_type_of_methods;

public class TestMethod {

	public static void main(String[] args) {
		B_learningVoidTypeMethod lvtm = new B_learningVoidTypeMethod();
		lvtm.addition();
		
		System.out.println("\n-----------------------------------------------------");
		C_learningReturnTypeMethod lrtm = new C_learningReturnTypeMethod();
		lrtm.subtraction();
		lrtm.myName();
		
		System.out.println("\n-----------------------------------------------------");
		E_learningReturnTypeMethodWithConstructor lrtmwc = new E_learningReturnTypeMethodWithConstructor();

		System.out.println("\n-----------------------------------------------------");
		D_learningReturnTypeMethodWhereMethodInsideMethod mim = new D_learningReturnTypeMethodWhereMethodInsideMethod();
		mim.subtraction();
		
		System.out.println("\n-----------------------------------------------------");
		F_learningParameterizedMethod lpm = new F_learningParameterizedMethod();
		lpm.addition(43, 21); // 43, 21 is argument
		lpm.addition(4, 5); // 4, 5 is argument
		lpm.addition(7, 15);
		// Parameterized method have some advantage: They can be called as many time as we want [reuse of method] by different argument
		
		lpm.subtraction(33, 2);
		lpm.subtraction(74, 22);
		
		// Changing argument give us different outcome from same method
		lpm.myName("Mohammad", "Sharkar");
		lpm.myName("Alex", "Fergunson");
		
		System.out.println("\n-----------------------------------------------------");
		new F_learningParameterizedMethod().addition(332, 110);
		// here new LearningParameterizedMethod() is the object
		
	}

}
