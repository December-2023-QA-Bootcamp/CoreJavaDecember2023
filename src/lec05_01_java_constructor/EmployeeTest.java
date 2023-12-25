package lec05_01_java_constructor;

public class EmployeeTest {

	public static void main(String[] args) {
		// When class is instantiated, means when object is created, Constructor is Initialized
		// default Constructor Initialized
		Employee emp01 = new Employee();
		// parameterized Constructor 01 initialized
		// Here "Mohammad Sharkar" is called 'argument'
		Employee emp02 = new Employee("Mohammad Sharkar");
		// parameterized Constructor 02 initialized
		Employee emp03 = new Employee("Jubraj", 483);
		// parameterized Constructor 03 initialized
		Employee emp04 = new Employee(2188458, "Ranabir");
		
		Employee ameli = new Employee(2465343, 'F');
		// parameterized Constructor 04 is initialized
		Employee emp05 = new Employee("Rakibur Khan", 1165343, 'M');
		// parameterized Constructor 05 is initialized
		Employee emp06 = new Employee("Jishan Zaman", 435527, 'F', true);
		Employee emp07 = new Employee("Shirazum", 439927, 'M', false);
		// parameterized Constructor 06 is initialized
		Employee emp08 = new Employee("Shah Al Muktadir", 239911, true, 'M');
		
	}

}
