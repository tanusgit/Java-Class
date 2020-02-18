package homeworkInheritence2Bank;

public class Hdfc extends RBIBank {
	
	@Override
	public  void processLoan(){
		System.out.println("Hdfc:: rate of intrest 12%");
	}
	
	public void interest() {
		System.out.println("Hdfc:: rate of intrest 24%");
	}
	
 }
