package heirarchyAbstractclass;

public class Hdfc extends Rbi {
	
	@Override
	public  void processLoan(){
		System.out.println("Hdfc:: rate of intrest 12%");
	}
	
	public void interest() {
		System.out.println("Hdfc:: rate of intrest 24%");
	}

	@Override
	public void createPPF() {
		// TODO Auto-generated method stub
		System.out.println("Hdfc:: rate of intrest 34%");
		
	}
	
 }
