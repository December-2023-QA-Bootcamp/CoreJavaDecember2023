package lec09_01_java_oop_encapsulation;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student();
		student.setStName("Mohammad Sharkar");
		student.setStId(483);
		student.setStGender('M');
		student.setFullTimeSt(false);
		student.setStGrade(3.43f);
		
		System.out.println("Student Name: " + student.getStName() + "\nStudent Id: " + student.getStId() + "\nGender: "
				+ student.getStGender() + "\nFull Time student? : " + student.isFullTimeSt() + "\nGrade: " + student.getStGrade());
	

	}

}
