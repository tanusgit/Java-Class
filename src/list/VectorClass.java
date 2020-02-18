package list;

import java.util.List;
import java.util.Vector;

public class VectorClass {
	public static void main(String[] args) {
		
	List<String> names = new Vector<String>();

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


