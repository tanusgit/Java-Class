package overrideInheritence;

public class Test {
	public static void main(String[] args) {
		Hdfc h = new Hdfc();
		h.demat();
		h.createAccount();
		h.processLoan();
		System.out.println("....................................");
		Icici i = new Icici();
		i.createPPF();
		i.createAccount();
		i.processLoan();
	}

}
