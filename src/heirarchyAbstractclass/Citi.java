package heirarchyAbstractclass;

public class Citi extends Rbi{


	public  void processLoan(){
		System.out.println("Citi:: rate of intrest 10%");
	}

	@Override
	public void createPPF() {
		System.out.println("citi:: rate of intrest 24%");
		// TODO Auto-generated method stub
		
	}
}
