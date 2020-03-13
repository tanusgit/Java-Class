package hashmap;

public class Notes {
/*Map is an iterface
 * Map has 3 classes
 * 1.HashMpa
 * 2.TreeMap
 * 3.LinkedHashMap
 *  
 *Map:
  every entry contains two elements Key and Value
  key can be any datatype , value can be any datatype
  
  Create map with with key as String aNd value as String:
  
  	Map<String, String> map = new HashMap<>();
    Map<String, String> map = new TreeMap<>();
    Map<String, String> map = new LinkedHashMap<>();
    
    Create map with with key as Interegr and value as String:-
      ------------------------------------------------
    Map<Integer, String> map = new HashMap<>();
    
    
 	Create map with with key as String and value as Person:-
      ------------------------------------------------
    Map<String, Person> map = new HashMap<>();
    
    Create map with with key as Department and value as Person:
    
    Map<Department, Person> map = new HashMap<>();
    
    methods:

	Map<String, String> map = new HashMap<>();

	//add to map
	map.put("133", "user7"); //key as 133 and value as user7
    map.put("133", "user21"); //key as 133 and value as user21
    //USER7 GETS REPLACED BY USER21 key is always unique
    // input is a key and return is a value...returns "user21"
     String d= map.get("133"); 
     //containsKey() tells whether the map contains the key or not
     boolean x= map.containsKey("133"); // returns boolean 
     
     map.remove("133"); // removes key + value 
     map.clear();// removes all keys + values 
     map.isEmpty(); //retunns boolean ,
     map.size() // return int size 
     map.entrySet(); returns all keys + values 
      
      
    HashMap :- adds in random order
  	TreeMap :- adds in sorting order of key
	LinkedHashMap :-adds elements in insertion order 
	
	
	if the key is an object the key has to override the hashcode and equals methods
  
 */
}
