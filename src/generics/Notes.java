package generics;

public class Notes {
	/*
	 Generics is for writing the code applicable for any data type
	 
  List<String> names = new ArrayList<String> ();
  names.add("user1");

  List<Integer> nums = new ArrayList<Integer> ();
  nums.add(245);

  List<Float> sals = new ArrayList<Float> ();
  sals.add(1313.131313f)
	 
 collections classes uses generics
	write code independent of the datatype
    Write code once and apply for any data type..	
    
     
  List names = new ArrayList();// add int/float/string/double/long
  names.add("user1");
  names.add(1222);
  names.add(1313.11313f);
  


	Raw list issues:  
---------------
	compile-time type checking
	risk of ClassCastException 
	
	generic methods
	generic classes
	//method
	public static void print1(String data) { // can be called by passing only string
		System.out.println(data);
	}
	
	print1("hello")
	
	//generic method
	 public static <E>  void print2(E data) {// can be called by passing any datatype, ex: int, string, float..etc..
                                       
		System.out.println(data);
	}
	 
	 
		print2(1)
     	print2(1232.131313f)
     	print2("Hello")
	 why should we write the <>?
	 ans: If we write the <E> java will know that E is not a class, it is a template
	 
	 
	 */

}
