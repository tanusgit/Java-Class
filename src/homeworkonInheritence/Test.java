package homeworkonInheritence;

public class Test {
	public static void main(String[] args) {
		Person p = new Person("person name: sila", 56, 1);
		p.displayPerson();
		System.out.println("########################################");
		Manager m = new Manager(" Mina", 40, 2, "Pan: ll", "pf: ff", "level", "kk");
		m.displayPerson();
		m.promotion();
		m.displayEmp();

		System.out.println("########################################");
		Employee e = new Employee("Employee name: Nil", 53, 3, "kl", "io");
		e.displayEmp();
		e.displayPerson();
		System.out.println("########################################");

		Engineer n = new Engineer("Rahul", 25, 5, "pan", "pfno", "Kumar", "l1", 52321, 2, 8);
		n.displayEmp();
		n.displayPerson();
		n.promotion();
		n.work();

	}

}
