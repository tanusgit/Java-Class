package homeworkonInheritence;
//window perspective reset perspective
public class Engineer extends Manager{
	
	int salary;
	int id;
	int workHour;
	

	public Engineer(String name, int age, int id, String pan, String pfNo, String name2, String level, int salary,
			int id2, int workHour) {
		super(name, age, id, pan, pfNo, name2, level);
		this.salary = salary;
		id = id2;
		this.workHour = workHour;
	}


	public void work() {
		System.out.println("Enginner: Engineers work 14 hours a day.");
	}

}
