package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class NewAddress {
	private String city = " ";
	private String cn = " ";
	private String state = " ";
	private String hsn = " ";
	private String stn = " ";
	static Scanner sc = new Scanner(System.in);
	public NewAddress(String city, String cn, String state, String hsn, String stn) {
		super();
		this.city = city;
		this.cn = cn;
		this.state = state;
		this.hsn = hsn;
		this.stn = stn;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCn() {
		return cn;
	}
	public void setCn(String cn) {
		this.cn = cn;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getHsn() {
		return hsn;
	}
	public void setHsn(String hsn) {
		this.hsn = hsn;
	}
	public String getStn() {
		return stn;
	}
	public void setStn(String stn) {
		this.stn = stn;
	}
	
	
	public void setall(String c, String cn, String stn, String hsn, String state ) {
		setStn(stn);
		setCn(cn);
		setCity(c);
		setState(state);
		setHsn(hsn);	
		
	}
	public static void setData2() {
		
		ArrayList<String> array = new ArrayList<>();
			System.out.println("enter address: ");
		for(int i = 0; i < 5 ; i++) {
			String input = sc.nextLine();
			array.add(input);
		}
		System.out.println("address  is");
		System.out.println(array);
		
	}
	
	public static void main(String[] args) {
		setData2();
	}
	
	
	
}
