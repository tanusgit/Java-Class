package inheritencemultiLevel;

public class Staff extends Employee {
//how many instance variables 7 
//methods 3 because it is inheriting methods and variables
//from the person class and the employee
//class
	String contractID;
	String contractPeriod;

	public void displayStaff() {
		System.out.println(contractID);
		System.out.println(contractPeriod);
	}
	

}
