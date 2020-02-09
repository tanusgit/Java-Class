package stat;

public class Static {
	/*static variables: global variables 
	memory is allocated only one time during class loading
	common data for all the objects
	can be accessed without object creation
	
	
	For instance variables memory is allocated every time when object is created 
	can be accessed after object creation
	specific data for all objects
	
	
	static blocks: gets executed only once and the first one to be executed 
	can get called automatically during the class loading
	initialize the static variables using the code dynamically generated value
	
	
	
	
	
	static method:
	when the logic is not applied on all the data of the object
	we do not need to create object
	
	*/
	
	
	//instance varible
		String dbName;
		
		//static variable
		static double rateOfIntrest;




	 static{
			 System.out.println("in static block");
			 rateOfIntrest = 12.5d;
		 }
	 	//constructor
		public Static(String dbName) {
			System.out.println("in constructor");
			this.dbName = dbName;
		}
	

}
