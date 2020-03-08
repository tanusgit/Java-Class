package innerClass;

public class StaticPerson {
	//static inner class can only access the static content of the outer class
		static int data = 30;
		
		int count = 23;

		static class Student {
			void msg() {
				System.out.println("data is " + data);
				//System.out.println(count);cannot access outer instance 
			}
		}
		
		//we dont need the inner object to call the inner method
		//outer class cannot be static class but inner class can be static
		
		public static void main(String args[]) {
			StaticPerson.Student obj = new StaticPerson.Student();
			obj.msg();
		}

}
