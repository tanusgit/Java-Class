package homeworkonInheritence;

public class Person {

	  String name;
	  int age;
	  int id;

	  public Person(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public void displayPerson(){
		  System.out.println("Person: " + name);
		  System.out.println("Person: " + id);
		  System.out.println("Person: " + age);
	  }


}
