package multilevelInterface;

public class Hdfc implements Rbi{

	@Override
	public void processLoan() {
		// TODO Auto-generated method stub
		System.out.println("loan approved");
		
	}

	@Override
	public void createAccount() {
		// TODO Auto-generated method stub
		System.out.println("account created");
		
	}

}
