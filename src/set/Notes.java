package set;

public class Notes {
/*
	
	set is an interface
	
	3 child classes:
	HashSet
	TreeSet
	LinkedHashSet 
	
	common for these classes:
	duplicates are not allowed
	search by content is very fast
	search by position is not applicable here
	
	
	Syntax:
	Set<String> names = new HashSet<String>();
			
	Set<String> names = new TreeSet<String>();
			
	Set<String> names = new LinkedHashSet<String>();
	
	methods names:
	
	add an element: add() by default avoids duplicate
	names.add("java");  -> add element and avoids duplicates
	boolean contains = names.contains("user1"); serach by content
	names.clear(); is to remove all elements
	names.isEmpty(); //returns boolean  -> to check if the set is empty or not
	names.size();   -> returns the no of elements added
	names.remove("user2"); -> remove by content
	display all:
	for(String p : names){
			System.out.println(p);
		}
	
	how to avoid duplicate objects using hashset:
	in the person class provide equals() and hashcode()
	add method internally uses equals() and hashcode() to avoid duplicates
	equals() is used to compare between two objects of any class



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	*/

}
