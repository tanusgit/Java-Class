package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
//prints element in order no duplicates
		Set<String> names = new TreeSet<String>();
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