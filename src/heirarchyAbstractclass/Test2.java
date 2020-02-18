package heirarchyAbstractclass;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Test2.input();
	}
	//with runtime polymorphism
	public static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter bank name:  ");
		String input = sc.next();
		//upcasting
		//because evry bank is extending RbI so no need to create new bank for 
		//every bank. advantage: less lines of code
		//main method does not care about rbi is abstract or not
		//it only matters to its child class 
		//when we write new operator then we create new object
		//Rbi r = null is just a reference of that Rbi class
		//and we can create reference for any abstract class
		Rbi r = null;
		if(input.equalsIgnoreCase("hdfc")) {
			r = new Hdfc();
				
		}
		else if(input.equalsIgnoreCase("icici")) {
			r = new Icici();
			
			
		}
		else if(input.equalsIgnoreCase("citi")) {
			r = new Citi();
			
		}
		//calling the method only one time
		//we cannot know where is the logic coming from we will only 
		//know based on the input
		r.createAccount();
		r.processLoan();
		if(r instanceof Hdfc) {
		Hdfc h = (Hdfc)r;
		h.interest();
		}
		if(r instanceof Icici) {
			Icici h = (Icici)r;
			h.createPPF();
			}
		
	}

}
