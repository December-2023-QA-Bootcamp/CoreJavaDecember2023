package lec19_java_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Use_of_arrayList_07 {
	// Unnecessary
	public static void main(String[] args) {
		int limit = 5;
		List<Integer> list = new ArrayList<Integer>();
		Random random = new Random();

		for (int i = 0; i < limit; i++) {
			list.add(random.nextInt(1000));
			System.out.println(list.get(i));
		}
	}
}
