package wrapperClass;

public class Notes {
	public static void main(String[] args) {
		//x cannot be null as it is a variable not an object
		//int x = null;
	}
	/*
	 * Wrapper classes:-
-------------------
For every primitive data type we have a Class available from Java which
is wrapper class.
Data types	Class
int         Integer
float		Float
long		Long
double		Double
character	Character
boolean		Boolean


for all the collections we need to store the primitive values using the wrappers
List<Integer> nums = new ArrayList<>();

int x = 90;

Integer y = new Integer(900);
Integer z= 899;
 y and z are objects here
 but x is not an object, it is a variable
 
 y and z can be null;
 but x cannot be null.
 
 >If a method is expecting object, then we have 
 to pass integer object but not primitive (int) value..
  
 we should use Integer sub2 we can identify the student who got 0 and
 who did not attend the exam at all
 
 
public class Student {
	Integer sub2;
	int sub1;

}
 
public class Test {
public static void main(String[] args) {

	Student s = new Student();
	System.out.println(s.sub1); //0
	System.out.println(s.sub2);  //null
	
}
}


How to create Objects for the wrapper:
---------------------------------------
Integer y1 = new Integer(900);
Float y2 = new Float(900.878787);
Long y3 = new Long(900a13131);
Double y4 = new Double(900.1113131);
Character y5 = new Character('c');
Boolean y6 = new Boolean(900);


How to convert primitive to wrapper:
------------------------------------------
int a = 90;
Integer y1 = new Integer(a);


to convert anything to strings 
String.valueOf()   -->

//when we read data from any website or any third party this considered as String
 * third party can be database, file or web page.
 * 
 *  // converting String to int
		String intStr = "12";
		int fromInt = Integer.parseInt(intStr);
		
		// 	converting String to float
		String floatstr = "134.00";
		float fromfloat = Float.parseFloat(floatstr);
				
 * 
 * 

	 */

}
