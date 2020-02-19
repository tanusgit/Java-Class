package exceptionhandling;

import java.util.Scanner;

public class StringConvert {
	public static void main(String[] args) {
		/*try {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age::");
		String age = sc.next();
		int ageInt = 0;
		ageInt = Integer.parseInt(age);
		System.out.println("after conversion age int :: " + ageInt);
		System.out.println("exit");
		}catch(Exception e) {
			//do not write Exception 
		}*/
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age::");
		String age = sc.next();
		int ageInt = 0;
		 try{
      //parseInt() has chances for exception 
			ageInt  = Integer.parseInt(age);
		 	}
		catch(NumberFormatException ex){
      //if exception occures then give meaning msg to customer
			System.out.println("invalid input ::"+age+". " +
					"please try again");
		}
		finally{
			System.out.println("in finally");
		}
		System.out.println("after conversion age int :: "+ageInt);
		System.out.println("exit");

	}
		
		
		
		
		
		

	
	
	

}
