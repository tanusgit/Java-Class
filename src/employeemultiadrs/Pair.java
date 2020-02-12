package employeemultiadrs;

public class Pair {
	Employee emp;
	Address ad;
	
	Pair(){
		
	}
	
	
	Pair(Employee e, Address a){
		emp = e;
		ad = a;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public Address getAd() {
		return ad;
	}

	public void setAd(Address ad) {
		this.ad = ad;
	}
	
	public void showPair() {
		System.out.println(emp.toString() + " "+  "" + ad.toString());
	}
	
}
