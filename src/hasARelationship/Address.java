package hasARelationship;

public class Address {
	
	
	String city;
	String country;
	String state;
	int houseNo;
	int streetNo;
	public Address(String city, String country, String state, int houseNo, int streetNo) {
		super();
		this.city = city;
		this.country = country;
		this.state = state;
		this.houseNo = houseNo;
		this.streetNo = streetNo;
	}
	
	public void showAddress() {
		System.out.println(city + " " +country+ "" + ""+ state + ""+ houseNo + ""+streetNo);
	}
	
	

}
