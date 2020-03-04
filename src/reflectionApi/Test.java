package reflectionApi;

public class Test {
	public static void main(String args[]) throws ClassNotFoundException {
		//creating the object for class named Class approach1 
		Class c = Person.class;
		System.out.println(c.getName());

		c = Student.class;
		System.out.println(c.getName());
		//forName() takes any class name as input and return the class object approach2
		c = Class.forName("reflectionApi.Person");
		System.out.println(c.getName());

		c = Class.forName("reflectionApi.Student");
		System.out.println(c.getName());
		
		
	}
}
