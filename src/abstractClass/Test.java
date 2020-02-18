package abstractClass;

public class Test {
public static void main(String[] args) {
	RBI h = new Hdfc();
	h.createAccount();
	//no need to downcast the object as we are not inheriting from the 
	//parent class rather we are implementing method from parent class
	//in the child class
	h.createPPF();
	h.processLoan();
}
}
