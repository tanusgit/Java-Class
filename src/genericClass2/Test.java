package genericClass2;

import java.util.List;

public class Test {
	public static void main(String[] args) {
		//assignments: calling this methods
		//
		//

	}
	//we can pass any arraylist of any data type
	static void show4(List<?> list) {

	}
	//we can pass  arraylist of person object or 
	//arraylist of student and employee objects
	//? means any class which is child of person class
	static void show3(List<? extends Person> list) {

	}
	//we can pass  arraylist of student object or 
	//arraylist of person object
	//? super means student and its parent class 
	static void show2(List<? super Student> list) {

	}
}
