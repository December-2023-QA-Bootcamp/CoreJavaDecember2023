package lec04_02_java_variables_declared;

public class MyInfoTest {

	public static void main(String[] args) {
		MyInfo tofael = new MyInfo(); 	// Constructor initialized
		tofael.myName = "Mohammad Sharkar"; // variable initialized
		tofael.myAge = 127;
		tofael.myApartmentRent = 32000;
		tofael.myYearlySalary = 764658365;
		tofael.myBankBalance = 23876832643264l;
		tofael.myHeight = 1.632654f;
		tofael.myGrade = 3.452364823;
		tofael.myGender = 'M';
		tofael.usCitizen = true;
		tofael.myInfo(); // method Initialized
		
		MyInfo amber = new MyInfo(); // Constructor Initialized
		amber.myName = "Amber Diamond";
		amber.myAge = 34;
		amber.myApartmentRent = 26000;
		amber.myYearlySalary = 453624361;
		amber.myBankBalance = 65842847263486l; // variable initialized
		amber.myHeight = 1.87653f;
		amber.myGrade = 3.1221223;
		amber.myGender = 'F';
		amber.usCitizen = false;
		amber.myInfo(); // method initialized
		
		MyInfo aroah = new MyInfo();
		aroah.myName = "Aroah";
		aroah.myAge = 23;
		aroah.myApartmentRent = 32445;
		aroah.myYearlySalary = 1782364;
		aroah.myBankBalance = 86536472686l;
		aroah.myHeight = 1.679f;
		aroah.myGrade = 3.488346;
		aroah.myGender = 'F';
		aroah.usCitizen = false;		
		aroah.myInfo();
		
		// here new MyInfo() is the object
		// but it has a limitation, we can't create more than one object
		new MyInfo().myName = "Tofael";
		
	}

}
