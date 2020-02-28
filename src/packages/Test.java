package packages;

import set.Person;
//import arrays.Person; cannot do this 
public class Test {
	public static void main(String[] args) {
		//for the 1st person we can import the package
		Person p1 = new Person(2, "Mi", 45);
		//for the second person we need to call the package 
		arrays.Person p2 = new arrays.Person(3, "hi");
		singleInheritance.Person p3 = new singleInheritance.Person();
	}

}
