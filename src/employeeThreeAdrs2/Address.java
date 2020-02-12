package employeeThreeAdrs2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Address {
	
	private String city = " ";
	private String country = " ";
	private String state = " ";
	private int houseNo = 0;
	private int streetNo = 0;
	//private String houseNo = " ";
	//private String streetNo = " ";
	
	
	
	
	
	
	
	/*public void setData() {
		String array[] = new String[5];
		System.out.println("enter address: ");
		city = sc.nextLine();
		country = sc.nextLine();
		state = sc.nextLine();
		streetNo = sc.nextLine();
		houseNo= sc.nextLine();
		array[0] = city;
		array[1] = country;
		array[2] = state;
		array[3] = streetNo;
		array[4] = houseNo;
		System.out.println(array);
		//addData(city,state, country,houseNo,streetNo);
		//showAddress();
	}
	
	public void setData2() {
		String array[] = new String[5];
		for(int j = 0; j < 3; j++) {
			System.out.println("enter address: ");
		
		for(int i = 0; i < 5 ; i++) {
			input = sc.nextLine();
			array[i] = input;
		}
		System.out.println("address " + (j+1) + " is");
		System.out.println(array.toString());
		}
	}
	
	
	
	
	
	
	
	public void setDataMultipleTimes(int num) {
		
		for(int i = 1; i <= num; i++) {
			//System.out.println("enter city, country, state, streetno, house no ");
		
			
		}
	}
	
	public void addData(String city, String state, String country,
			String houseNo, String streetNo) {
		ArrayList<String> col = new ArrayList<>();
		col.add(city);
		col.add(state);
		col.add(country);
		col.add(houseNo);
		col.add(streetNo);
		System.out.println(col);
	}
	
	/*public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	public int getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(int streetNo) {
		this.streetNo = streetNo;
	}

	public Address() {
		
	}
	
	public Address(String city, String country, String state, int houseNo, int streetNo) {
		super();
		this.city = city;
		this.country = country;
		this.state = state;
		this.houseNo = houseNo;
		this.streetNo = streetNo;
	}
	*/
	public void showAddress() {
		System.out.println(city + " " +country+ " " + " "+ state + " "+ houseNo + " "+streetNo);
	}
	@Override
	public String toString() {
		String res = city + " " +country+ " " + " "+ state + " "+ houseNo + " "+streetNo;
		return res;
	}
	public Address(String city, String country, String state, int houseNo, int streetNo) {
		super();
		this.city = city;
		this.country = country;
		this.state = state;
		this.houseNo = houseNo;
		this.streetNo = streetNo;
	}
	
	

}
