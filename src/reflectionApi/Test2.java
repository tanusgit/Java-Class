package reflectionApi;

public class Test2 {
	public static void main(String args[]) throws ClassNotFoundException {
//reflection api is intended to get all the information about the class not about the 
//object of the class
		Person p = new Person();
		Student s = new Student();
		

		// creating Class object using person object
		Class c = p.getClass();
		System.out.println(c.getName());

		Class c1 = s.getClass();
		System.out.println(c1.getName());
		//what is the parent class of student
		System.out.println(c1.getSuperclass().getName());

	}
}
