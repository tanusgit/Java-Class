package annotations.field;

public class Person {
	
	@Size(min=8)
	private String id;

	@Size(min= 7)
	private String name;

	public Person(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}