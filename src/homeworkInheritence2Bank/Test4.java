package homeworkInheritence2Bank;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your sal bank:");
		String salBank = sc.next();
//all the classes are extending rbi so child classes of rbi can call
//methods of rbi, run time polymorphism
		if (salBank.equals("hdfc")) {
			Hdfc h = new Hdfc();
			execute(h);
		} else if (salBank.equals("sbi")) {
			Citi s = new Citi();
			execute(s);
		} else if (salBank.equals("icici")) {
			Icici i = new Icici();
			execute(i);
		} else {
			RBIBank r = new RBIBank();
			execute(r);
		}
	}
//method taking rbi object
	private static void execute(RBIBank r) {
		r.createAccount();
		r.processLoan(); 
	}
	
	
}


