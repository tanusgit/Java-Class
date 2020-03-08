package ananymousClass;

public class AnanymousInner {
//create the child class + override the method + create the object
	
	public static void main(String[] args) {
		PersonService ps =  new PersonService() {
			
			@Override
			void print() {
				// TODO Auto-generated method stub
				System.out.println("hello");
				
			}
		};
		PersonService ps2 = new PersonService() {
			
			@Override
			void print() {
				// TODO Auto-generated method stub
				System.out.println("welcome");
				
			}
		};
		ps.print();
		ps2.print();
		
	}
}
