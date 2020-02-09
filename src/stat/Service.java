package stat;

public class Service {

	public static void main(String[] args) {

	}

	// instance variable
	String dbName = "oracle";

	// static variable
	static double rateOfIntrest = 12.5d;

	public void m3() {
		System.out.println("inside  display2");
	}

	public static void m4() {
		System.out.println("in static getData2");
	}
	
	public void m1(){
		System.out.println(dbName);
		System.out.println(rateOfIntrest);
		m3();
		m4();
	}
	
	public static void m2(){
		//System.out.println(dbName);
		System.out.println(rateOfIntrest);
		//m3();
		m4();
	}

	//can instance method access all the data fields and the methods
	//yes
	//can static methods access all the data fields and the methods
	//no can only access static method and static variables
	
	
	
}
