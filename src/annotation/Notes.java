package annotation;

public class Notes {
/*
 * annotations are used by the framework like Hybernate and Springs
 * the purpose of annotation is to specify the configuration
 * 
 * annotatons are created by frameworks but 
annotation usage is specified by developer...
 * 
 *  how to create annotation and usage
 *  frameworks are external libraries
 *  
 *  advantage of annotations:
 *  
 *  - how to create annotation and usage
 *  
 *  annotations provided by java internal library:
 *  Builtin : @Override    @Deprecated  @SuppressWarnings 
 *  
 *  where can we specify annotation:
-class
-Instance variable
-method
-constructor

annotations are interface.

how to create custom made annotation
1.
@interface MyAnnotation{  
int min();  
}  
  
how to use custom made annotation
public class Emp{  

 @MyAnnotation(min=10)  
 String data;
 
 @MyAnnotation(min=8)  
 String data1;
 
}
2.

@interface MyAnnotation{  
int value() default 0;  
}  
//specify min is optional here

public class Emp{  

 @MyAnnotation(min=10)  
 String data;
 
 @MyAnnotation  
 String data1;
 
}

3.
1.

@interface MyAnnotation{  
int min();  
String value2();  
String value3();  
  
}

public class Emp{  

 @MyAnnotation(min=10,value2="abc",value3="xyz")  
 String data;
}

4.
by doing the following we can write annotation for a class, method, instance variable

@Target(
{
ElementType.TYPE, 
ElementType.FIELD, 
ElementType.METHOD})
@interface MyAnnotation{  
int value1();  
String value2();  
} 

@MyAnnotation(value1="abc", value2="xyz")
public class Emp
{
@MyAnnotation(value1="efg", value2="ijk")
 int id;
 
 @MyAnnotation(value1="lmn", value2="opq")
 public void check(){
 }

}

@Retention
RetentionPolicy.SOURCE
RetentionPolicy.CLASS
RetentionPolicy.RUNTIME


@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.TYPE)  
@interface MyAnnotation1{  
int value1();  
String value2();  
}  

retention is at which time annotation is applicable




ex:
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty; 

public class User {
  //@NotEmpty means email id cannot be empty
	@NotEmpty
	@Email
	private String email;
	
	@NotEmpty(message = "Please enter your password.")
	@Size(min = 6, max = 15,message = "Your password must between 6 and 15 characters")
	private String password;

}
 */
}
