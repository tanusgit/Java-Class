package inheritenceValidate;

public class Employee extends Person {
	// pan exact 13 out of which 2 of them is numbers
	// pf 4ch-4ch-4ch
	/*
	 * this class has 5 instance variables as it extends Person class
	 */
	
	//take input first then do validation in the other function
	String pf = " ";
	String pan = "";

	public Employee() {
		super();
		setPf();
		setPan();
	}

	public String getPf() {
		return pf;
	}

	public void setPf() {
		System.out.println("enter pf: ");
		String pf = sc.next();
		int l = pf.length();
		/*
		 * char array[] = pf.toCharArray(); 
		 * System.out.println("string length " + l);
		 * int length = array.length; 
		 * System.out.println("char array length " + length);
		 */
		if (l == 14) {
			char c = pf.charAt(4);
			char c1 = pf.charAt(9);
			if (c == '-' && c1 == '-') {
				this.pf = pf;
			} else {
				System.out.print("wrong input");
			}
		} else {
			System.out.print("wrong input");
		}

	}

	public String getPan() {
		return pan;
	}

	public void setPan() {
		//at least 2 numbers should be there in pan
		System.out.println("enter pan: ");
		String pan = sc.next();
		if (pan.length() == 13) {
			int count = 0;
			for(int i =0; i < 13; i++) {
				char c = pan.charAt(i);
				if(Character.isDigit(c)) {
					count++;
				}
			}
			if(count >= 2) {
				this.pan = pan;
			}
			else {
				System.out.println("Wrong input");
				}
			
		}
		else {
		System.out.println("Wrong input");
		}
	}
	
	public void show() {
		super.show();
		System.out.println(getPf() + " " + getPan() );
	}

}
