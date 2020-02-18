package homeworkInheritence2Bank;

public class Test5 {
	public static void main(String[] args) {
		RBIBank i = new Icici();
		i.createAccount();
		i.processLoan();
		//downcast when we need to call the child's specific method
		Icici i1 = (Icici)i;
		i1.createPPF();
		
		//we cannot convert one child object to another child object
		//we will get class cast exception
		//we have created object for icici class and tried to downcast
		//it or convert it to hdfc
		 Hdfc h1 = (Hdfc)i;
		 h1.interest();
		
		
	}

}
