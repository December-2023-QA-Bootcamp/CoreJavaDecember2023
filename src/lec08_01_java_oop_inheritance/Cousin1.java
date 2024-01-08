package lec08_01_java_oop_inheritance;

// Line 4 is not possible, because you can use only one extends keyword
// public class Cousin1 extends Aunt extends GrandFather {

public class Cousin1 extends Aunt {
	public void cousin1Info() {
		System.out.println("Cousin1: Maya, Aunt: Jamila, Grandfather: Ismail");
	}
}
