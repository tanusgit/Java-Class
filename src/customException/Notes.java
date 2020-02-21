package customException;

public class Notes {
/*
For checked exception, exception handling is mandatory:
SQL, io, File, class not found exception, when we deal with the third party 
like files, database

For unchecked exception, exception handling is optional:
Arithmetic, null pointer, index out of bounds, 

create your own exception class if you need to 

Can we create our own exception class??
Yes

custom Exception/User Defined Exception:
--------------------------------------
-> Developer will create Exception class
-> Dev will create exception obj & throw
-> Dev will handle the exception using try + catch
  
Why should we create exception class?
ans: To handle the negative scenarios in the project.
  
  
  ex: 
age < 18 is invalid for the application ,but it is valid for java ...
any invalid data for id , name , usertype  is found we have to create exception.

age < 18 cannot be ArithmeticException.

syntax:
1.create a exception class which is a child class for java.lang.Exception
2. provide private final instant variables + constructor + getter methods..
 
  public class BusinessException extends Exception {

}


req:

take input for name , age, city , usertype
validation for name, age , city usertype ,
if invalid data found then throw exception for BusinessException

name cannot be > 15 char
age between 18 & 60
city should be either hyd or bang or cheanni
usertype should be admin or agent

*/}
