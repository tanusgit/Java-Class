package ananymousClass;
//call print function twice
abstract class PersonService {
	abstract void print();
	
}



class Child1 extends PersonService{
	@Override
	void print() {
		System.out.println("hello");		
	}
	
}

class Child2 extends PersonService{
	@Override
	void print() {
		System.out.println("bye");		
	}
}

class Child3 extends PersonService{
	@Override
	void print() {
		System.out.println("welcome");		
	}
	
}
