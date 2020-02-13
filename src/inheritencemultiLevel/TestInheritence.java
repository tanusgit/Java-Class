package inheritencemultiLevel;

public class TestInheritence {
	public static void main(String[] args) {
		
		Person p = new Person();
		p.age = 8;
		p.id = 9;
		p.name = "Nila";
		p.displayPerson();
		Employee m = new Employee();
		System.out.println("******************************");
		//employee is accessing age, name and id as well as 
		//displayPerson() this claases have a is-a relationship
		//inheritence is a is-a relationship.
		m.age = 5;
		m.id = 2;
		m.name = "uma";
		m.pan = "jj";
		m.pfNo = "kk";
		m.displayEmp();
		m.displayPerson();
		System.out.println("###########################");
		Staff f = new Staff();
		f.contractID = "1";
		f.contractPeriod = "2";
		f.age = 87;
		f.name = "nil";
		f.pfNo = "4";
		f.pan = " kl";
		f.id = 7;
		f.displayEmp();
		f.displayPerson();
		f.displayStaff();
		
		
	}

}
