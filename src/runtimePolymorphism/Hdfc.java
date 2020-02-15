package runtimePolymorphism;
public class Hdfc extends RBI{
//overriding method
	public void processLoan() {
		System.out.println("HDFC: 12%");
	}
	//thic class's method
	public void demat() {
		System.out.println("HDFC: demat 13%");
	}
	//createAcc() inherited method
}
