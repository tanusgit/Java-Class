package homeworkInheritence2Bank;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Test.input();
	}
	
	public static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter bank name:  ");
		String input = sc.next();
		if(input.equalsIgnoreCase("hdfc")) {
			Hdfc h = new Hdfc();
			h.createAccount();
			h.processLoan();	
		}
		else if(input.equalsIgnoreCase("icici")) {
			Icici i = new Icici();
			i.createAccount();
			i.processLoan();
			
		}
		else if(input.equalsIgnoreCase("citi")) {
			Citi c= new Citi();
			c.createAccount();
			c.processLoan();
			
		}
		else if(input.equalsIgnoreCase("rbi")) {
			RBIBank r= new RBIBank();
			r.createAccount();
			r.processLoan();
		}
		
	}

}
