package inheritenceValidate2;

public class Staff extends Employee{
//contact id contact period ext employee
////contract id string begins with C_ or P_
//contract period 6-24
/*
 * this class has 7 instance variables as it extends Employee and Employee extends 
 * Person class
 */
	String contractId = " ";
	int contractPeriod = 0;
	
	
	
	public Staff() {
		
	}
	
	public void takeinput() {
		System.out.println("enter contract Id: ");
		String c = sc.next();
		System.out.println("enter contract Period: ");
		int contractPeriod = sc.nextInt();
		
	}
	
	public void validate(String contactId, int contractperiod) {
		if (contactId.startsWith("C_") || contactId.startsWith("P_")) {
			this.contractId = contactId;
		}
		else {
		System.out.println("Wrong input");
		}
		if ( contractperiod > 5 && contractperiod < 25) {
			this.contractPeriod = contractperiod;
		}
		else {
		System.out.println("Wrong input");
		}
		
	}
	
	
	public String getContractId() {
		return contractId;
	}
	public void setContractId() {
		System.out.println("enter contract Id: ");
		String c = sc.next();
		if (c.startsWith("C_") || c.startsWith("P_")) {
			this.contractId = c;
		}
		else {
		System.out.println("Wrong input");
		}
		
	}
	public int getContractPeriod() {
		return contractPeriod;
	}
	public void setContractPeriod() {
		System.out.println("enter contract Period: ");
		int contractPeriod = sc.nextInt();
		if ( contractPeriod > 5 && contractPeriod < 25) {
			this.contractPeriod = contractPeriod;
		}
		else {
		System.out.println("Wrong input");
		}
		
	}
	public void show() {
		super.show();
		System.out.println(getContractId() + " " + getContractPeriod() );
	}
	
	
}
