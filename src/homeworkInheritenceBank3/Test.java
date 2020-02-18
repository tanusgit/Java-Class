package homeworkInheritenceBank3;

public class Test {
	public static void main(String[] args) {
		Hdfc h = new Hdfc();
		//h.processLoanForExisting();
		//h.processLoanForNew();
		h.processLoan();
		h.processLoan("235");
		System.out.println("*********************************************");
		RBIBank r = new RBIBank();
		r.processLoan();
		r.processLoan("123");
		//r.processLoanForExisting();
		//r.processLoanForNew();
	}
	

}
