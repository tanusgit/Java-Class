package SingleInheritenceUsingConstructor;

public class Test {
	public static void main(String[] args) {
		Person p = new Person("sila", 8, 1);
		p.displayPerson();
		System.out.println("###################################");
		Employee m = new Employee("Mina", 81, 2, "ho", "ml");
		m.displayEmp();
		//employee has new methods and variables inherited from person class
		//so these new variables and methods belong to it 
		System.out.println("the variables of parent class cannot be accessed"
				+ " without calling the diplay method of the parent class");
		m.displayPerson();
	}

}
