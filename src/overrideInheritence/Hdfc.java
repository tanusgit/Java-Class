package overrideInheritence;

public class Hdfc extends RBIBank {
	public void demat(){
		System.out.println("Hdfc:: demat processed");
	}
	@Override
	public  void processLoan(){
		System.out.println("Hdfc:: rate of intrest 12%");
	}
	
 }
