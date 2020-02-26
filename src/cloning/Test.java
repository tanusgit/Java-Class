package cloning;

public class Test {
public static void main(String[] args) throws  CloneNotSupportedException{
	Employee e1 = new Employee();
	 e1.setId(2);
	 e1.setName("Ram");
	 Employee c2 = null;
	 
	// try {
		
	 c2 = (Employee) e1.clone();
	 
	/*} catch (CloneNotSupportedException e) {
		
		e.printStackTrace();
	}*/
	 
	 System.out.println("e1 : " + e1);
	 
	 System.out.println("c2 : " + c2);
	 e1.setId(5);
	 e1.setName("Radha");
	 System.out.println("after changing e1  ************************************");
	 System.out.println("e1 : " + e1);
	 
	 System.out.println("c2 : " + c2);
	 
	 
}
}
