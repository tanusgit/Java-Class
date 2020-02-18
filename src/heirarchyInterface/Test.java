package heirarchyInterface;

import java.util.Scanner;

public class Test {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your sal bank:");
			String salBank = sc.next();
//creating only one reference of RBIBank
			RBIBank r = null;
			if (salBank.equals("hdfc")) {
				r = new Hdfc();
			} else if (salBank.equals("sbi")) {
				r = new SBI();
			} else if (salBank.equals("icici")) {
				r = new Icici();
			}  
			r.createAccount();
			r.createPPF();
			r.getKYC();

			}
	

}
