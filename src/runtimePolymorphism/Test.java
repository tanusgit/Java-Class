package runtimePolymorphism;

public class Test {
	public static void main(String[] args) {

		Hdfc h = new Hdfc(); // create obj for HDFC and refer by HDFC
		h.createAcc(); // RBI
		h.processLoan(); // HDFC
		h.demat(); // HDFC
		//upcasting
		RBI r = new Hdfc(); // this is possible when
		//rbi is a parent and hdfc is a child 
		//create obj for Hdfc and refer by RBI
		r.createAcc();
		r.processLoan();
		//we cannot call child specific method as we have created the object
		/*using parent class and parent does not know what is inside the child class
		 * so we cannot access the methods of child class, we can only access the methods
		 * of parent class
		 * 
		 */
		// r.demat();
	}

}
