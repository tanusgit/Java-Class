package reflectionApimethodobject;

//using reflection api we can call the private methods outside the class
//otherwise it is not possible to call private methods outside the class
class Service {
	private void add(int x, int y) {
		System.out.println((x+y));
	}

	private void print() {
		System.out.println("welcome private function");
	}
}
