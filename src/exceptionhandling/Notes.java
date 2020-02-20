package exceptionhandling;

import java.util.Scanner;

public class Notes {
	/*
	 * Exception:
-----------
Unexpected scenario/event that occurs at the run time.
  

what happens when there is an exception:

program will stop and application flow would break
customer will see the technical message instead of meaningful message.
affect the business 
--------------------------


Why exception?:
----------------
->Bad coding practices
-3rd party/ server/ hardware
-> Missing testing the scenario
Can we avoid exception during runtime?? NO

What is java role?
->Java created the exception object based on the reason 
->Exception obj contains the exception message + what are 
the class+method+line nos involved for exception(stacktrace)
->Java stops the application flow..

Exeception handling will be required when there is an exception...
 Adv:

   -> choice for retry/ continue/ stop
   prepare meaning msg to the customer..
   write the technical messages like exception reason+ cause to the server logs

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age::");
		String age = sc.next();
		int ageInt = 0;
		ageInt = Integer.parseInt(age);
		System.out.println("after conversion age int :: " + ageInt);
		System.out.println("exit");
above program throws numberformat exception if we pass a String

the following is called stacktrace:
at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.base/java.lang.Integer.parseInt(Integer.java:652)
	at java.base/java.lang.Integer.parseInt(Integer.java:770)
	at atm/exceptionhandling.StringConvert.main(StringConvert.java:11)
	
	
	integer.parseInt() has a chances for throwing numberformat exception
	numberformat exception is a class
	
	How to do exception handling:
	try block
	catch block
	finally block
	
try{
  <write code that has chances for exception>
}
catch blocks executes when there is an exception
catch(){
  //executed only when there is an exception
  <exception handling code
}finally{
  <optionl, required only when dealing with 3rs parties>
  //exceuted always ...
  when we need to execute something no matter what happens then we write finally
  
  
  can we have one try block with many catch block?
  yes
  but at a time only one catch block is executed
}

		String name = "";
		int num1 = 20;
		int num2 = 1;
		int nums[] = new int[5];
		String data = "";
		try {
			// possibility of exception due to divide by zero
			int x = num1 / num2;
			System.out.println(x);

      //possobility for numberformat execpion
			int z = Integer.parseInt(data);
			
      // java.lang.NullPointerException occurs if obj is not created
			System.out.println(name.length());

			// error due to invalid index array index out of bound
			System.out.println(nums[9]);
      
		} catch (Exception ex) {
      //this catch block can handle any exception that occurs in try block
      //this is a global exception handling block in case if we are not sure of which  exception occurs.
			// ex.printStackTrace();
			System.out.println("Generic exception occured...." + ex.getMessage());
    }finally {
			System.out.println("Program ends");
		}



//when we write multiple catch block we have to keep global exception handling 
 * at the end
 * we cannot keep the global exception in the top because we will have compilation 
 * error
	can we create the exception?
	yes
	syntax:
	ArithmeticException ex = new ArithmeticException("num2 cannot be 0");
	throw ex; this throwing the exception logic should be inside the if statement
			
			 
	if (num2 == 0) {
			ArithmeticException ex = new ArithmeticException("num2 cannot be 0");
			throw ex;
		}		 
			 
		if we want to throw an exception object
		1.create an exception object
		2.throw the object
			 
		Exception is the parent class of all the exception class
		
		when we create exception or java creates exception, it does not matter
		we need to do the exception handling
		
		
->
If the parent class is Exception , then we term the class as Exception class.


			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
	 *
	 *
	 *
	 */

	
	
}
