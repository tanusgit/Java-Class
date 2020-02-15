package homeworkInheritencePerson4;

import java.util.Scanner;

public class Employee extends Person {
	String pan = "";
	String pf = "";

	public Employee(int id, String name, int age, Address adrs, String pan, String pf) {
		super(id, name, age, adrs);
		this.pan = pan;
		this.pf = pf;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getPf() {
		return pf;
	}

	public void setPf(String pf) {
		this.pf = pf;
	}

	public void display() {
		super.display();
		System.out.println(pan);
		System.out.println(pf);

	}

	public String toString() {
		String res = pan + " " + " " + pf + " ";
		return res;
	}

}
