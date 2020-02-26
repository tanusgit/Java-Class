package cloning;

public class Employee implements Cloneable {
	String name;
	int id;
	public Employee() {
		
	}
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
