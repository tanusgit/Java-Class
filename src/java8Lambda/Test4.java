package java8Lambda;

import java.util.ArrayList;
import java.util.List;

public class Test4 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("user1");
		list.add("user2");
		list.add("user3");
		list.add("user4");
		list.add("user11");
		list.add("user21");
		list.add("user33");

		// old style
		for (String n : list) {
			System.out.println(n.toUpperCase());
		}

		// new style
		// list.forEach((String d) -> { System.out.println(d)); };
		list.forEach((String d) -> System.out.println(d));
		list.forEach((d) -> System.out.println(d));

		// new style
		list.forEach((String d) -> {
			System.out.println(d);
		});
		
		list.forEach((d) -> {
			System.out.println(d);
		});
		
		 // print upper
		list.forEach((d) -> 
		{System.out.println(d.toUpperCase());});
		
		 //remove str that starts with user1
	    list.removeIf((a) -> a.startsWith("user1"));
			System.out.println("after removing starts with user1");
			list.forEach((d) -> System.out.println(d));

	}
}
