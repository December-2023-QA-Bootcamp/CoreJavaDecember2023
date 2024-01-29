package lec14_02_java_conditional_statements;

public class S01_example_of_switch_in_shirt_size {

	public static void main(String[] args) {
		char size = 'l';

		switch (size) {

		case 'S':
			System.out.println("Yes, We have your small sizeShirt");
			break;

		case 'M':
			System.out.println("Yes, We have your mediun sizeShirt");
			break;

		case 'L':
			System.out.println("Yes, We have your large size shirt");
			break;

		case 'X':
			System.out.println("Yes, We have your XL size shirt");
			break;

		default:
			System.out.println("Sorry! We don't have your shirt");
			break;

		}

	}

}
