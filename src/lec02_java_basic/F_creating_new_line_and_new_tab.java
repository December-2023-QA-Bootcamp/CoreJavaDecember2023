package lec02_java_basic;

// how to delete a specific line?
// put your cursor at the end, or beginning or middle, and then type 'control/command + d'

// some symbol and characters are used "inside String"
// use of \n --> creating a new line (not next line) ---> a lot of use of \n in IT industry
// use of \t --> creating a tab  ---> a lot of use of \t
// No need to give a space after \n or \t, it will give you a space

// Below 2 is: extra information, not used generally
// use of \b --> creating back space -- not used --- also doesn't work in eclipse (Work in IntelliJ)
// use of \r --> creating carriage return -- not used -- similar like \n

public class F_creating_new_line_and_new_tab {

	public static void main(String[] args) {
		System.out.println("Janet Yellen, Born in 1946, American economist and Chair of the US Federal Reserve, born in Brooklyn, New York");
		System.out.println("\n-------------------------------------------------------------------------------------------------------------------");
		System.out.println("\tJanet Yellen, \n\tBorn in 1946," + " \nAmerican economist and" + "\tChair of the US Federal Reserve, \tborn in Brooklyn, \tNew York");
		System.out.println("\t"+"I am Alex");
	}

}

// TODO Tofael: Why \t is not working everywhere?
