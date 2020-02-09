package constructor;

public class TestPerson {
	public static void main(String[] args) {
		Person p = new Person("Mina" , 5 , 1);
		p.show();
		//show() is showing 3 values because inside the show() we are printing
		//3 values. 
		Person p2 = new Person("Rina" , 51);
		p2.id = 2;
		p2.show();
		
		Person p1 = new Person();
		//p1.age = 51;
		//p1.id =1;
		//p1.name ="Jirami";
		p1.show();
		
		/*//difference between constructor and methods
		constructor can be called only once for one object while methods 
		can be called for several times
		
		constructor name is always same as class name
		method name can be anything
		
		
		constructor will not have any return type
		but methods have return type
		
		
		constructor is called during the object creation
		method is called after object is created
		
		
		constructor is a automatic call
		method is a explicit call
		
		constructor can initialize the instance variables
		
		
		
		we do not have to write a lot of code
		
		
		
		
		
		
		*/

}
}
