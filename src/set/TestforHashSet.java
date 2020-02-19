package set;

import java.util.HashSet;
import java.util.Set;

public class TestforHashSet {
	
	public static void main(String[] args) {

		Set<String> names = new HashSet<String>();
		names.add("java");
		names.add("sap");
		names.add("hana");
		names.add("apple");
		names.add("zebra");
		names.add("sap");
		names.add("veeru");
		names.add("dotnet");
		names.add("hana");
		
	 	System.out.println("Entered NAMES ARE :");
		//4. display the names
		
		print(names);
		
		boolean contains = names.contains("user1");
		System.out.println(contains);
		
		
		names.add("user2");
		System.out.println("after adding user2");
		print(names);
		
		names.isEmpty(); //returns boolean
		names.remove("user2");
		System.out.println("after removing user2");
		print(names);

		System.out.println("size = "+names.size());
		System.out.println("contains user2"+names.contains("user2"));//returns boolean
	
		names.clear();
		System.out.println("size after clear = "+names.size());
	}

	private static void print(Set<String> names) {
		System.out.println("**************************");
		for(String p : names){
			System.out.println(p);
		}
	}
}
