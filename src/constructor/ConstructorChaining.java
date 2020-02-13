package constructor;

public class ConstructorChaining {
	//calling a constructor from another constructor
	public class Person {
		int id;
		String name;
		int age;

		public Person(int age, String name) {
		 this(0,age,name);
		}
		
	 	// param arg bconstructor
		public Person(int id, int age, String pName) {
			this.id = id;
			this.age = age;
			name = pName;
		}

		public void display() {
			System.out.println(id);
			System.out.println(name);
			System.out.println(age);
		}
	}

}

