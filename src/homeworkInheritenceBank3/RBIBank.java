package homeworkInheritenceBank3;

public class RBIBank {
	
	
	/*public  void processLoanForExisting(){
		System.out.println("RBIBank:: rate of intrest 8%");
	}
	
	public  void processLoanForNew(){
		System.out.println("RBIBank:: rate of intrest 9%");
	}*/
	
	//*Sir........
	 public void createAccount() {
		System.out.println("RBIBank:: created Account");
	}
	//new customer
	public void processLoan(){
		System.out.println("RBIBank:: rate of intrest 9%");
	}
	//for existing customer
	public void processLoan(String custId){
		System.out.println("RBIBank:: rate of intrest 8% " +
				"for custId:"+custId);
	}
	 
	 
}

