package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedListTest {
	public static void main(String[] args) {
//does not print in order no duplicates
//it stores elements in the order they are inserted
		Set<String> names = new LinkedHashSet<String>();
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
		
		for(String p : names){
			System.out.println(p);
		}
  
 
}}