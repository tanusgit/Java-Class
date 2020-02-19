package set;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args) {
//does not print in order no duplicates
//stores in random order and displays also in that order
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
		
		for(String p : names){
			System.out.println(p);
		}
  
 
}}