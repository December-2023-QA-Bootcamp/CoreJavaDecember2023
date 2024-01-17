package lec11_01_java_oop_polymorphism;

public class TestCalculator {

	public static void main(String[] args) {
		System.out.println("-------- Land Calculator --------");
		LandCalculator lc = new LandCalculator();
		lc.landCalculator(); // void type method -01 initialized
		lc.landCalculator(23, 86); // return type parameterized method -02 initialized
		lc.landCalculator(23, 86, 10); // return type parameterized method -03 initialized
		lc.landCalculator(3.443f, "32", 30); // return type parameterized method -04 initialized
		lc.landCalculator("54", 3.013f, 44); // return type parameterized method -05 initialized
		lc.landCalculator(23, 86, 10, 41); // return type final parameterized method -06 initialized
		LandCalculator.landCalculator(23, 86, 10, 41, 20); // return type static  parameterized method -07 initialized
	
		System.out.println("\n-------- Modern Calculator --------");
		ModernCalculator mc = new ModernCalculator();
		mc.landCalculator(); // void type method -01 initialized
		mc.landCalculator(23, 86); // return type parameterized method -02 initialized
		mc.landCalculator(23, 86, 10); // return type parameterized method -03 initialized
		mc.landCalculator(3.443f, "32", 30); // return type parameterized method -04 initialized
		mc.landCalculator("54", 3.013f, 44); // return type parameterized method -05 initialized
			
	}

}
