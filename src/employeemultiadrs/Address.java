package employeemultiadrs;

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
	
	Address(){
		
	}
	
	public void showAddress() {
		System.out.println(getCity() + " " + getCountry() + " " + " "+ getState() + " "+ getHouseNo() + " "+getStreetNo());
	}
	public String getCity() {
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
