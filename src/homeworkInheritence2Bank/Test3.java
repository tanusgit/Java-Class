package homeworkInheritence2Bank;

public class Test3 {
	public static void main(String[] args) { 
		// CREATE OBJ FOR ICICI
		
		//run time polymorphism
		RBIBank r = new Icici();
		r.createAccount();//logic from parent
		r.processLoan(); // logic frm child
		//r.createPPF(); // gives compilation ; method is specific to icici
		// CREATE OBJ FOR SBI
		
		r = new Citi();
		r.createAccount();//logic from parent
		r.processLoan();//logic from parent
		
		// CREATE OBJ FOR HDFC
		r = new Hdfc();
		r.createAccount();//logic from parent
		r.processLoan();// logic frm child
	}

}
