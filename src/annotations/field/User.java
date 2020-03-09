package annotations.field;

public class User {
	
	@Size(min=8)
	private String pan;

	public User(String pan) {
		super();
		this.pan = pan;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}
}
