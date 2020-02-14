package homeworkonInheritence;

public class Manager extends Employee{


	public Manager(String name, int age, int id, String pan, String pfNo, String name2, String level) {
		super(name, age, id, pan, pfNo);
		name = name2;
		this.level = level;
	}

	String name;
	String level;
	
	public void promotion() {
		System.out.println("Manager : manager can promote someone");
	}

}
