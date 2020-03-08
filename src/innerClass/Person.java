package innerClass;
//Person is outer class
public class Person {
		private int data = 30;

		public void print(){
			System.out.println(data);
		}
		//Student is inner class
		class Student {
			int age;
			void msg() {
				System.out.println("data is " + data);
			}
		}
	
	
	public static void main(String args[]) {
		//how to access innner class's methods
		Person obj = new Person();
		Person.Student in = obj.new Student();
		in.msg();
	}
}

