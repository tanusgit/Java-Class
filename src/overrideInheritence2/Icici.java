package overrideInheritence2;

public class Icici extends RBIBank {
	int charge = 1000;

	public void createPPF() {
		System.out.println("Icici:: createed ppf");
	}

//we want parent class logic and the child class logic
// so override the method and call the parent class' method from the
// child class' method
//super key word is used to differentiate between the child and the parent class
	public void processLoan() {
		super.processLoan();
		System.out.println(" " + charge);
	}

}
