package lec09_01_java_oop_encapsulation;

public class TuteeTest {

	public static void main(String[] args) {
		Tutee student = new Tutee("Tofael", 2188458, 'M', true, 3.21f);
		System.out.println("Student Name: " + student.getStName() + "\nStudent Id: " + student.getStId() + "\nGender: "
				+ student.getStGender() + "\nFull Time student? : " + student.isFullTimeSt() + "\nGrade: " + student.getStGrade());

	}

}
