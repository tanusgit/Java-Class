package hierarchyInheritence;

public class Test {
	public static void main(String[] args) {
		Hdfc h = new Hdfc();
		h.createAccount();
		h.createPPF();
		h.getKYC();
		h.processLoan();
		System.out.println("------------------------------");
		SBI s = new SBI();
		s.createAccount();
		s.createPPF();
		s.getKYC();
		s.processLoan();
		System.out.println("------------------------------");
		Icici i = new Icici();
		i.createAccount();
		i.createPPF();
		i.getKYC();
		i.processLoan();
		System.out.println("------------------------------");
		RBIBank r = new RBIBank();
		r.createAccount();
		r.getKYC();
		r.processLoan();
	}

}
