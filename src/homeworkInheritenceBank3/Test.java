package homeworkInheritenceBank3;

public class Test {
	public static void main(String[] args) {
		Hdfc h = new Hdfc();
		h.processLoanForExisting();
		h.processLoanForNew();
		System.out.println("*********************************************");
		RBIBank r = new RBIBank();
		r.processLoanForExisting();
		r.processLoanForNew();
	}
	

}
