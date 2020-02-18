package multilevelInterface;

public class Test {
	public static void main(String[] args) {
		//have to create the object for the immediate parent always
		Rbi r = new Hdfc();
		r.createAccount();
		r.processLoan();
		
	}

}
