package reflectioAPIconstructor;

public class Employee {

		public int id = 1111;
		int age = 23;
		String name = "kumar";
		static String course = "Java";

		public Employee() {
			super();
		}

		 private Employee(int id, int age, String name) {
			super();
			this.id = id;
			this.age = age;
			this.name = name;
		}
		
		public void m1(int p1, int p2) {
			System.out.println("m1() called for "+ p1 +" ," +p2);
		}

		public String m2(String p3) {
			return "Mr/Mrs"+p3;
		}

		public void m3(String str) {
			System.out.println("m3() called for "+ str);
		}

	}

