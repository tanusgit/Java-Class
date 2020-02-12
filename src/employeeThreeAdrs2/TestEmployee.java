package employeeThreeAdrs2;

public class TestEmployee {
	public static void main(String[] args) {
		//employee with 3 address
		System.out.println("welcome");
		Employee emp = Service.getEmployeeWithData();
		emp.setPresentadrs(Service.getaddressWithData());
		emp.setOfficeadrs(Service.getaddressWithData());
		emp.setPermanentadrs(Service.getaddressWithData());
		emp.display();
		emp.getPermanentadrs().showAddress();
		emp.getPresentadrs().showAddress();                                         
		emp.getOfficeadrs().showAddress();
		
	}
	

}
