package object;

public class TestCal2 {
	public static void main(String[] args) {
		//set the data only once by setter()
		//then perform all the operation using methods on the object
		//if we have 20 instance variables we don't need to pass 20 variables
		// inside the methods 
		Calc2 obj = new Calc2();
		obj.setA(2);
		obj.setB(3);
		
		int a = obj.add();
		int s = obj.sub();
		int m = obj.multi();
		int d = obj.div();
		System.out.println("addition: " + a + "\n" + "subtraction: " + s + "\n" + "multiplication: " + m + "\n"
				+ "division: " + d);
		
		Calc2 obj1 = new Calc2();
		obj1.setA(4);
		obj1.setB(3);
		// function's logic is applied on the data of the calling object
		a = obj1.add();
		s = obj1.sub();
		m = obj1.multi();
		d = obj1.div();
		System.out.println("addition: " + a + "\n" + "subtraction: " + s + "\n" + "multiplication: " + m + "\n"
				+ "division: " + d);
	}

}
