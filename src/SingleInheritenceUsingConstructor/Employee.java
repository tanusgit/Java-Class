package SingleInheritenceUsingConstructor;

public class Employee extends Person {

	String pan;
	String pfNo;
//employee class has 5 instance variables AND THAT IS WHY IT has 5 arguments
	// in the employee constructor
	//it has 2 own member variables and 3 parent class' variables
	//so it is calling the parent class' constructor by calling the super()
	//we are initializing the member variables by using the parent class'
	//constructor
	public Employee(String name, int age, int id, String pan, String pfNo) {
		super(name, age, id);
		this.pan = pan;
		this.pfNo = pfNo;
	}

	public void displayEmp() {
		System.out.println(pan);
		System.out.println(pfNo);
	}

}
