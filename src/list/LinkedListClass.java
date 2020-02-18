package list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {
	public static void main(String[] args) {
		// 2. create string array
		List<String> names = new LinkedList<String>();

		names.add("user1");
		names.add("user2");
		names.add("user9");
		names.add("user3");

		// display names:
		System.out.println("Entered names are::");

		for (String name : names) {
			System.out.println(name);
		}
	}

}
