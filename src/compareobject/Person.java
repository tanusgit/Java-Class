package compareobject;

public class Person {
		int id;
		String name;
		int age;
		Person(){
			
		}

		public Person(int age, String name) {
		 this(0,age,name);
		}
		
	 	// param arg bconstructor
		public Person(int id, int age, String pName) {
			this.id = id;
			this.age = age;
			name = pName;
		}
		
		
		//over riding the equals and hashcode method of object class
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + age;
			result = prime * result + id;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}
//this equals() only good when we want to know if the objects are equal not not
		//compareTo() tells more than that if the object is greater or less than the other
		//call equals() on the object
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Person other = (Person) obj;
			if (age != other.age)
				return false;
			if (id != other.id)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}

		public void display() {
			System.out.println(id);
			System.out.println(name);
			System.out.println(age);
		}

}
