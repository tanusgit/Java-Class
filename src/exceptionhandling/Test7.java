	package exceptionhandling;
	
	public class Test7 {
		/*
		 * Requirement:
	----------------
	main() calls m2()
	m2() calls m3()
	m3() calls m4()
	
	
	main()
	{
	  <some code1>
	   m2()
	   <some code2>
	}
	
	
	m2() throws SQLException
	{
	  <some code3>
	   m3()
	   <some code4>
	}
	
	
	m3() 
	{
	  <some code5>
	   m4()
	   <some code6 save emp deatils>
	}
	
	
	m4() {
	  <some code to validate emp deatils>
	  <some code to validate emp deatils and throw exception if validatn fails>
	   
	}
	

vaidation logic is in m4() 
if validation is failed in m4() ----> only code that should execute is to 
give message to customer
if validation fails <some code4> , <some code6> should not execute.....
  

solutions:
in m4() -> throw exception 
in main() -> write try + catch 
give message to the use from main()

when exception is created the only code to execute is catch() block , 
and catch block is in main method..

 m4() , m3() , m2()  should not handle exception , they have to rethrow the exception to the caller.. 

  
when exception is created it will first go to m4 then m3 then m2
m4 will give the exception object to m3
m3 will give the exception object to m2
m2 will give the exception object to main
then it give back to main method then main method will have the try catch block
  
m4() + m3() + m2()  =====> write throws keyword 

throws keyword:
---------------------
throws we need write at the method declaration.
the method is not responsible for the exception


m2() throws SQLException
{
  <some code3>
   m3()
   <some code4>
}


m3() throws SQLException
{
  <some code5>
   m4()
   <some code6 save emp deatils>
}


m4() throws SQLException{
  <some code to validate emp deatils and throw exception if validatn fails>
   
}



ex:
m3() throws SQLException, IOException
{
  <some code5>
   m4()
   <some code6 save emp deatils>
}


m3() method will not have try + catch block only for  SQLException, IOException
m3() method is not responsible for handling SQLException, IOException



summmary:
------------
  1.create exception in m4() using throw keyword
  2.m2, m3, ,m4() will  not handle exceptio , write throws keyword at method declaratn
	3. main will have try catch block
	
	throw is for creating an exception
	throws means the method will not handle the exception
	we write throws in the method declaration
	
	
throw:
to create new exception
throw logic write in method body.


throws:
specify method will  not handle exception
throw logic write in method declaration.

	 */
		
		
	
	}
