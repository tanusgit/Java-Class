package list;

public class Notes {
	/*
	 * dont need to specify the size at first
	 * we can increase the size later on
	 * 
	 * List (interface)
---------------------

 
Child classes:
------------------
  -ArrayList
  -Vector
  -LinkedList
  
  In list no need to specify size.
  
  syntax:
List<String> = new ArrayList<String>();   -> create arraylist for String
List<String> = new Vector<String>();     -> create Vector for String
List<String> = new LinkedList<String>(); -> create LinkedList for String


List<Integer> nums= new ArrayList<Integer>();   -> create arraylist for Integer
List<Integer> nums= new Vector<Integer>();     -> create Vector for Integer
List<Integer> nums= new LinkedList<Integer>(); -> create LinkedList for Integer


List<Float> nums= new ArrayList<Float>();   -> create arraylist for Float
List<Float> nums= new Vector<Float>();     -> create Vector for Float
List<Float> nums= new LinkedList<Float>(); -> create LinkedList for Float


List<Person> persons= new ArrayList<Person>();   -> create arraylist for Person
List<Person> persons= new Vector<Person>();     -> create Vector for Person
List<Person> persons= new LinkedList<Person>(); -> create LinkedList for Person


methods name:
Method names: [ArrayList/Vector/Linkedlist]:
-----------------------------------------------
  
  List<String> names = new ArrayList<String>();
  
// add new element
names.add("user1");
names.add("user2");
names.add("user4");

insertion happens always at the end 


names.add(2, "user5");  // adds new element at 2nd position

names.clear(); // deletes all elements

String data = names.get(1); // search by position .
 ex: gets the element at 2nd position.


boolean found = names.contains("user4"); // returns boolean , search by content

boolean content = names.isEmpty(); // returns boolean to check whether list 
is empty or not

  int count = names.size(); // to find size
  
  
  difference between vectors and arrylist
  arraylist is not synchronized, vector is synchronized
  
->Vector is threadsafe
-> AL is not threadsafe


->Vector can be used in multithread environment
-> AL cannot be used in multithread environment

if the object is being updated by multiple programs then we need to use vector
in vector code will execute one at a time
in arraylist code will execute all at once


LinkedList vs ArrayList
LinkedList  vs Vector
---------------------------
Arraylist/Vector interally uses arrays
LinkedList internally uses linked DS , every element contain data 
and ref of next data.

Search by position is fast for AL/Vector
Search by position is slow for Linkedlist


Insert in between/delete in between is slow for AL/Vector
Insert in between/delete in between is fast for Linkedlist

Can grow , but cannot decrease for AL/Vector
Can grow and can decrease for LinkedList


Memory allocated and no of elements are not same in AL/Vector. 
=> Leads to memory wasted

Memory allocated and no of elements are same in LinkedList.

 common disadvantage:
-----------------------
-> Duplicates are allowed
-> SEARCH BY CONTENT is very slow
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
